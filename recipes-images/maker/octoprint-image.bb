#Angstrom image for 3d printing

require recipes-images/angstrom/systemd-image.bb

IMAGE_INSTALL += " \
        octoprint-nginx \
        screen \
        bash \
        sshfs-fuse \
	iproute2-tc \
"

export IMAGE_BASENAME = "Octoprint-image"

