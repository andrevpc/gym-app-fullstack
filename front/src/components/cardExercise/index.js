import React from 'react';
import { View, Text, Image, Button, TouchableOpacity, TextInput } from 'react-native';
import styles from './styles';

const CardExercise = ({ title, img }) => {
    return (
        <View style={styles.card}>
            <Text style={styles.cardTitle}>{title}</Text>
            <Image
                source={img}
                style={styles.img}
            />
            <View style={styles.info}>
                <Text style={styles.cardBody}>Peso usado: </Text>
                <TextInput
                    keyboardType='numeric'
                    style={styles.input}
                />
            </View>
        </View>
    );
};

export default CardExercise;