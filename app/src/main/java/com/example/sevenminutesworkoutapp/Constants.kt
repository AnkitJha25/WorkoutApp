package com.example.sevenminutesworkoutapp

object Constants {

    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        //1
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        //2
        val abdominalCrunch = ExerciseModel(
            2,
            "Abdominal Crunch",
            R.drawable.ic_abdominal_crunches,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

        //3
        val highKneesRunningInPlace = ExerciseModel(
            3,
            "High Knees Running in Place",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false
        )
        exerciseList.add(highKneesRunningInPlace)

        //4
        val lunge = ExerciseModel(
            4,"Lunges",
            R.drawable.ic_lunge,
            false,
            false
        )
        exerciseList.add(lunge)

        //5
        val plank = ExerciseModel(
            5,
            "Plank",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(plank)

        //6
        val pushUps = ExerciseModel(
            6,
            "Push-Up",
            R.drawable.ic_push_ups,
            false,
            false
        )
        exerciseList.add(pushUps)

        //7
        val pushUpsAndRotation = ExerciseModel(
            7,
            "Push-Up and Rotation",
            R.drawable.ic_push_ups_and_rotations,
            false,
            false
        )
        exerciseList.add(pushUpsAndRotation)

        //8
        val sidePlank = ExerciseModel(
            8,
            "Side Plank",
            R.drawable.ic_side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)

        //9
        val squats = ExerciseModel(
            9,
            "Squats",
            R.drawable.ic_squats,
            false,
            false
        )
        exerciseList.add(squats)

        //10
        val stepUpOntoChair = ExerciseModel(
            10,
            "Step Up onto Chair",
            R.drawable.ic_step_up_onto_chair,
            false,
            false
        )
        exerciseList.add(stepUpOntoChair)

        //11
        val tricepsDipOnChair = ExerciseModel(
            11,
            "Triceps Dip on Chair",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false
        )
        exerciseList.add(tricepsDipOnChair)

        //12
        val wallSitExercise = ExerciseModel(
            12,
            "Wall Sit Exercise",
            R.drawable.ic_wall_sit_exercise,
            false,
            false
        )
        exerciseList.add(wallSitExercise)

        return  exerciseList
    }
}