import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import styles from "./styles";
import chestImg from '../../../assets/images/chest.webp'
import Card from '../../components/card';
import axios from 'axios';
import Header from '../../components/header';

const DaysPage = () => {
    console.log(sessionStorage.getItem("token"))
    const loadDays = (async () => {
        try {
            await axios.post("http://localhost:8080/auth/validate", {}, { headers: { 'Authorization': `Bearer ${sessionStorage.getItem("token")}` } }).then((res) => {
                console.log(res)
            });

        } catch (error) {
            console.log(error)
        }
    });

    return (
        <View style={styles.container}>
            <Header pageName='Treinos' />
            <Card title="Treino A" body="Peito e Tríceps" img={require("../../../assets/images/chest.webp")} />
            <Card title="Treino B" body="Costas e Bíceps" img={chestImg} />
        </View>
    );
};

export default DaysPage;