import React, { useEffect, useState } from 'react';
import { View, Text, StyleSheet, } from 'react-native';
import styles from "./styles";
import chestImg from '../../../assets/images/chest.webp'
import Card from '../../components/card';
import CardExercise from '../../components/cardExercise';
import Header from '../../components/header';
import ExerciseCards from '../../components/exerciseCards';
import axios from 'axios';

const DayPage = ({route}) => {
    const { day } = route.params
    var [exercises, setExercises] = useState([])

    useEffect(() => {
        loadExercise()
    }, [])

    const loadExercise = (async () => {
        try {
            const res = await axios.get(`http://localhost:8080/exercise/day/${day.id}`)
            setExercises(res.data)
        } catch (error) {
            console.log(error)
        }
    })

    return (
        <>
        <View style={styles.container}>
            <Header pageName={day.name} />
            <ExerciseCards exercises={exercises} />
        </View>
        </>
    );
};

export default DayPage;