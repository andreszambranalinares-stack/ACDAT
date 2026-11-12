import java.util.ArrayList;
import java.util.List;

public class TestStream {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));


        // Obtener la cantidad de cursos con más de 300 alumnos inscritos.
        long mas300 = cursos.stream()
                .filter(c -> c.getAlumnos() > 300)
                .count();

        // Listar los títulos de los cursos que tienen entre 10 y 50 videos
        cursos.stream().filter(c -> c.getVideos() >= 10 && c.getVideos() <= 50)
                .map(Curso::getTitulo)
                .forEach(System.out::println);

        // Mostrar en consola el título y duración de los cursos que tengan más de 500 alumnos inscritos.
        cursos.stream().filter(c ->c.getAlumnos() > 500)
                       .forEach(c -> System.out.println(c.getTitulo() + c.getDuracion()));

        //Obtener el curso con la menor cantidad de alumnos inscritos
        cursos.stream();

        // 5 Listar los cursos ordenados por cantidad de videos de menor a mayor. (
        cursos.stream().sorted().forEach(System.out::println);

        // 6 Mostrar los títulos de los cursos cuyo título contiene la palabra "profesional".
        cursos.stream().filter(c -> c.getTitulo().contains("profesional"))
                .map(Curso::getTitulo)
                .forEach(System.out::println);

        // 7 Determinar si existe algún curso con más de 100 videos
        cursos.stream().anyMatch(c-> c.getVideos() > 100);

        // 8 Determinar si todos los cursos tienen una duración superior a 1 hora
        cursos.stream().allMatch(c-> c.getDuracion() >1);

        // 9 Verificar si ningún curso tiene menos de 10 alumnos inscritos.
        cursos.stream().noneMatch(c -> c.getAlumnos() < 10);

        // 10 Obtener un nuevo ArrayList<String> con los títulos de todos los cursos
        cursos.stream().map(Curso::getTitulo)
                .toList();
        // 11 Calcular el promedio de duración de todos los cursosCalcular el promedio de duración de todos los cursos
        cursos.stream().mapToDouble(c-> c.)
    }

}
