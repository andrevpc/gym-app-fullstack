import React, { useEffect } from 'react';
import { View, Text, StyleSheet } from 'react-native';
import styles from "./styles";
import chestImg from '../../../assets/images/chest.webp'
import Card from '../../components/card';
import axios from 'axios';
import Header from '../../components/header';
import { Button } from 'react-native';
import DaysCards from '../../components/daysCards';
import { useState } from 'react';
import { useSelector } from 'react-redux';

const DaysPage = () => {
    const { token } = useSelector((store) => store.auth);

    var [days, setDays] = useState([])

    useEffect(() => {
        loadDays()
    }, [])

    const loadDays = (async () => {
        try {
            const userEmail = await axios.post("http://localhost:8080/auth/validate", {}, { headers: { 'Authorization': `Bearer ${token}` } })
                // .then((res) => {
                //     console.log(res)
                // });
            const res = await axios.get(`http://localhost:8080/day/user/${userEmail.data}`)
            setDays(res.data)

        } catch (error) {
            console.log(error)
        }
    });

    return (
        <View style={styles.container}>
            <Header pageName='Treinos' />
            {/* <Card title="Treino A" body="Peito e Tríceps" img={require("../../../assets/images/chest.webp")} />
            <Card title="Treino B" body="Costas e Bíceps" img={chestImg} /> */}
            <DaysCards days={days} />
        </View>
    );
};

export default DaysPage;