import React from 'react';
import { View, Text, StyleSheet, } from 'react-native';
import styles from "./styles";
import chestImg from '../../../assets/images/chest.webp'
import Card from '../../components/card';
import CardExercise from '../../components/cardExercise';
import Header from '../../components/header';

const DayPage = () => {
    return (
        <>
        <View style={styles.container}>
            <Header pageName='Treino A' />
            <CardExercise title="Supino Reto com Barra" img={require("../../../assets/images/legExtension.webp")} />
        </View>
        </>
    );
};

export default DayPage;