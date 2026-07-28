import { Cell, Pie, PieChart, ResponsiveContainer } from "recharts";
import "./piaChartBox.scss";
import { Tooltip } from "@mui/material";

const data = [
  { name: "Mobile", value: 400, color: "#0088FE" },
  { name: "Desktop", value: 300, color: "#00C49F" },
  { name: "Laptop", value: 300, color: "#FFBB28" },
  { name: "Tablet", value: 200, color: "#FF8042" },
];

const PiaChartBox = () => {
  return (
    <div className="piaChartBox">
      <h1 className="leades">Leades by Source</h1>
      <div className="chart">
        <ResponsiveContainer width="99%" height={300}>
                  <PieChart >
                      <Tooltip contentStyle={{background:"white", borderRadius:"5px"}} />
            <Pie
              data={data}
              innerRadius={60}
              outerRadius={75}
              paddingAngle={5}
              dataKey="value"
            >
              {data.map((item) => (
                <Cell
                  key={item.name}
                  fill={item.color}
                />
              ))}
            </Pie>
          </PieChart>
        </ResponsiveContainer>
      </div>
      <div className="options">
        {data.map(item => (
          <div className="option" key={item.name}>
            <div className="title">
              <div className="dot" style={ {backgroundColor:item.color}} />
              <span>{item.name}</span>
            </div>
            <span>{ item.value}</span>
          </div>
        ))}
      </div>
    </div>
  );
};

export default PiaChartBox;
