import React from 'react';
import { View, Text, Image, Button, TouchableOpacity, TextInput } from 'react-native';
import styles from './styles';

const CardExercise = ({ exercise }) => {
    return (
        <View style={styles.card}>
            <Text style={styles.cardTitle}>{exercise.name}</Text>
            <Image
                source={exercise.img}
                style={styles.img}
            />
            <Text style={styles.cardTitle}>Séries: {exercise.numSets}x{exercise.repetitionsPerSet}</Text>
            <Text style={styles.cardTitle}>Peso: {exercise.weight} kg</Text>
            <Text style={styles.cardTitle}>Equipamento: {exercise.equipment}</Text>
        </View>
    );
};

export default CardExercise;