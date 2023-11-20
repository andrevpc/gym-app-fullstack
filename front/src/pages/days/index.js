import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import styles from "./styles";
import chestImg from '../../../assets/images/chest.webp'
import Card from '../../components/card';

const DaysPage = () => {
    return (
        <>
            <Card title="Treino A" body="Peito e Tríceps" img={require("../../../assets/images/chest.webp")} />
            <Card title="Treino B" body="Costas e Bíceps" img={chestImg} />
        </>
    );
};

export default DaysPage;