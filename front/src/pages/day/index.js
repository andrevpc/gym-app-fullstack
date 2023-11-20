import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import styles from "./styles";
import chestImg from '../../../assets/images/chest.webp'
import Card from '../../components/card';
import CardExercise from '../../components/cardExercise';

const DayPage = () => {
    return (
        <>
            <CardExercise title="Supino Reto com Barra" img={require("../../../assets/images/legExtension.webp")} />
        </>
    );
};

export default DayPage;