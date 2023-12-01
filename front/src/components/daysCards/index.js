import Card from "../card"

export default function DaysCards({ days }) {
    return days.map((day) => {
        //#region IFs
        if (day.muscles[0] === "Glúteo")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Glutes.jpg?v=1601050628'
        else if (day.muscles[0] === "Costas")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Back.jpg?v=1601050704'
        else if (day.muscles[0] === "Peito")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Chest.jpg?v=1601050935'
        else if (day.muscles[0] === "Ombro")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Shoulders.jpg?v=1601051035'
        else if (day.muscles[0] === "Ombro")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Shoulders.jpg?v=1601051035'
        else if (day.muscles[0] === "Quadríceps")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Quadriceps.jpg?v=1601051118'
        else if (day.muscles[0] === "Posterior")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_hamstrings.jpg?v=1601051184'
        else if (day.muscles[0] === "Panturrilha")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Calves.jpg?v=1601051316'
        else if (day.muscles[0] === "Tríceps")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Triceps.jpg?v=1601051412'
        else if (day.muscles[0] === "Bíceps" || day.muscles[0] === "Braço")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Biceps.jpg?v=1601051495'
        else if (day.muscles[0] === "Abdômen")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Abs.jpg?v=1601051622'
        else if (day.muscles[0] === "Antebraço")
            var img = 'https://cdn.shopify.com/s/files/1/1214/5580/files/Muscle_Group_Forearms.jpg?v=1601051687'
        //#endregion
        return (
            <Card day={day} key={day.id} img={img} />
        )
    })
};