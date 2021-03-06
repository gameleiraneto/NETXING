package modelosBD;
// Generated 02/10/2016 11:46:09 by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Videofavorito generated by hbm2java
 */
@Entity
@Table(name = "VIDEOFAVORITO", catalog = "netxing")
public class VideoFavorito implements java.io.Serializable {

	private Integer idVideoFavorito;
	private Usuario usuario;
	private Video video;

	public VideoFavorito() {
	}

	public VideoFavorito(Usuario usuario, Video video) {
		this.usuario = usuario;
		this.video = video;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idVideoFavorito", unique = true, nullable = false)
	public Integer getIdVideoFavorito() {
		return this.idVideoFavorito;
	}

	public void setIdVideoFavorito(Integer idVideoFavorito) {
		this.idVideoFavorito = idVideoFavorito;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USUARIO_idUsuario", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIDEO_idVideo", nullable = false)
	public Video getVideo() {
		return this.video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
