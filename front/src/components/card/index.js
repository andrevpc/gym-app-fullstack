import React from 'react';
import { View, Text, Image, Button, TouchableOpacity } from 'react-native';
import styles from './styles';
import { useNavigation } from "@react-navigation/native"

const Card = ({ day, img }) => {
    var navigation = useNavigation()
    return (
        <View style={styles.card}>
            <Image
                source={{uri: img}}
                style={styles.img}
            />
            <View style={styles.info}>
                <Text style={styles.cardTitle}>{day.name}</Text>
                <Text style={styles.cardBody}>{day.muscles[0]}</Text>
            </View>
            <View style={styles.btnContainer}>
                <TouchableOpacity style={styles.btn} title="Fazer" onPress={() => navigation.navigate("day", {day: day})}>
                    <Text style={styles.btnTxt}>Fazer</Text>
                </TouchableOpacity>
            </View>
        </View>
    );
};

export default Card;