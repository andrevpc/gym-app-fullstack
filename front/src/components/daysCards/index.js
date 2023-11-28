import Card from "../card"

export default function DaysCards({ days }) {
    return days.map((day) => {
        console.log(day.name)
        console.log(day.muscles[0])
        return (
            <Card title={day.name} body={day.muscles[0]} key={day.id} img={require("../../../assets/images/chest.webp")} />
        )
    })
};