import React from 'react';
import { View, Text, Image, Button, TouchableOpacity, TextInput } from 'react-native';
import styles from './styles';

const CardExercise = ({ title, img }) => {
    return (
        <View style={styles.card}>
            <div style={{
                display: "flex",
                flexDirection: "column"
            }}>
                <Text style={styles.cardTitle}>{title}</Text>
                <div style={{
                    width: "100%",
                    display: "flex",
                    justifyContent: "center",
                    flexDirection: "center"
                }}>
                    <Image
                        source={img}
                        style={styles.img}
                    />
                </div>
                <div style={{
                    margin: "5px 0px 5px 3px"
                }}>
                    <Text style={styles.cardBody}>Peso usado: </Text>
                    <TextInput
                        style={styles.input}
                    />
                </div>
            </div>
        </View>
    );
};

export default CardExercise;