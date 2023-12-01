import CardExercise from "../cardExercise"

export default function ExerciseCards({ exercises }) {
    return exercises.map((exercise) => {
        var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Glutes.jpg?v=1601050628'
        return (
            <CardExercise exercise={exercise} key={exercise.id} />
        )
    })
};