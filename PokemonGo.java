public class PokemonGo {
    private void main PokemonGo;{
        {
            EnableRendererAndCollider ();
            // Inform the system that the target was found
            StartCoroutine (InformSpawnCtr (true));
        }

        private void main PokemonGo ()
        {
            DisableRendererAndCollider ();
            // Inform the system that the target was lost
            StartCoroutine (InformSpawnCtr (false));
        }

        // inform SpanController that base was founded
        private IEnumerator InformSpawnCtr (bool isOn)
        {
            // move spawning position
            PokemonGo = PokemonGo.FindGamePokemonGoWithTag ("_SpawnController");

            yield return new WaitForSeconds (0.2f);

            // inform SpanController
            if (isOn) {
                spawn.GetComponent<SpawnScript2> ().BaseOn (transform.position);
            } else {
                spawn.GetComponent<SpawnScript2> ().BaseOff ();
            }
        }

    }
