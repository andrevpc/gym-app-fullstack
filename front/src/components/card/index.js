import React from 'react';
import { View, Text, Image, Button, TouchableOpacity } from 'react-native';
import styles from './styles';

const Card = ({ title, body, img }) => {

    return (
        <View style={styles.card}>
            <Image
                source={img}
                style={styles.img}
            />
            <View style={styles.info}>
                <Text style={styles.cardTitle}>{title}</Text>
                <Text style={styles.cardBody}>{body}</Text>
            </View>
            <View style={styles.btnContainer}>
                <TouchableOpacity style={styles.btn} title="Fazer" onPress={() => console.log("AA")}>
                    <Text style={styles.btnTxt}>Fazer</Text>
                </TouchableOpacity>
            </View>
        </View>
    );
};

export default Card;