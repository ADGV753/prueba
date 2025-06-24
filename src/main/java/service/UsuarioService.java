package service;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioService {
        @Autowired
        private UsuarioRepository usuarioRepository;

        // Obtener todos los usuarios
        public List<Usuario> obtenerTodos() {
            return usuarioRepository.findAll();
        }

        // Guardar un nuevo usuario
        public Usuario guardar(Usuario usuario) {
            return usuarioRepository.save(usuario);
        }

        // Actualizar un usuario existente
        public Usuario actualizar(Long id, Usuario usuarioActualizado) {
            Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
            if (optionalUsuario.isPresent()) {
                Usuario usuario = optionalUsuario.get();
                usuario.setCC(usuarioActualizado.getCC());
                usuario.setNombre(usuarioActualizado.getNombre());
                usuario.setEmail(usuarioActualizado.getEmail());
                usuario.setContraseña(usuarioActualizado.getContraseña());
                return usuarioRepository.save(usuario);
            } else {
                return null;
            }
        }

        // Eliminar un usuario por ID
        public boolean eliminar(Long id) {
            if (usuarioRepository.existsById(id)) {
                usuarioRepository.deleteById(id);
                return true;
            }
            return false;
        }
    }
