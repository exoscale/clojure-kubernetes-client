(ns kubernetes.specs.v1/volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/aws-elastic-block-store-volume-source :refer :all]
            [kubernetes.specs.v1/azure-disk-volume-source :refer :all]
            [kubernetes.specs.v1/azure-file-volume-source :refer :all]
            [kubernetes.specs.v1/ceph-fs-volume-source :refer :all]
            [kubernetes.specs.v1/cinder-volume-source :refer :all]
            [kubernetes.specs.v1/config-map-volume-source :refer :all]
            [kubernetes.specs.v1/csi-volume-source :refer :all]
            [kubernetes.specs.v1/downward-api-volume-source :refer :all]
            [kubernetes.specs.v1/empty-dir-volume-source :refer :all]
            [kubernetes.specs.v1/fc-volume-source :refer :all]
            [kubernetes.specs.v1/flex-volume-source :refer :all]
            [kubernetes.specs.v1/flocker-volume-source :refer :all]
            [kubernetes.specs.v1/gce-persistent-disk-volume-source :refer :all]
            [kubernetes.specs.v1/git-repo-volume-source :refer :all]
            [kubernetes.specs.v1/glusterfs-volume-source :refer :all]
            [kubernetes.specs.v1/host-path-volume-source :refer :all]
            [kubernetes.specs.v1/iscsi-volume-source :refer :all]
            [kubernetes.specs.v1/nfs-volume-source :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-volume-source :refer :all]
            [kubernetes.specs.v1/photon-persistent-disk-volume-source :refer :all]
            [kubernetes.specs.v1/portworx-volume-source :refer :all]
            [kubernetes.specs.v1/projected-volume-source :refer :all]
            [kubernetes.specs.v1/quobyte-volume-source :refer :all]
            [kubernetes.specs.v1/rbd-volume-source :refer :all]
            [kubernetes.specs.v1/scale-io-volume-source :refer :all]
            [kubernetes.specs.v1/secret-volume-source :refer :all]
            [kubernetes.specs.v1/storage-os-volume-source :refer :all]
            [kubernetes.specs.v1/vsphere-virtual-disk-volume-source :refer :all]
            )
  (:import (java.io File)))


(def v1/volume-data
  {
   (ds/opt :awsElasticBlockStore) v1/aws-elastic-block-store-volume-source-spec
   (ds/opt :azureDisk) v1/azure-disk-volume-source-spec
   (ds/opt :azureFile) v1/azure-file-volume-source-spec
   (ds/opt :cephfs) v1/ceph-fs-volume-source-spec
   (ds/opt :cinder) v1/cinder-volume-source-spec
   (ds/opt :configMap) v1/config-map-volume-source-spec
   (ds/opt :csi) v1/csi-volume-source-spec
   (ds/opt :downwardAPI) v1/downward-api-volume-source-spec
   (ds/opt :emptyDir) v1/empty-dir-volume-source-spec
   (ds/opt :fc) v1/fc-volume-source-spec
   (ds/opt :flexVolume) v1/flex-volume-source-spec
   (ds/opt :flocker) v1/flocker-volume-source-spec
   (ds/opt :gcePersistentDisk) v1/gce-persistent-disk-volume-source-spec
   (ds/opt :gitRepo) v1/git-repo-volume-source-spec
   (ds/opt :glusterfs) v1/glusterfs-volume-source-spec
   (ds/opt :hostPath) v1/host-path-volume-source-spec
   (ds/opt :iscsi) v1/iscsi-volume-source-spec
   (ds/req :name) string?
   (ds/opt :nfs) v1/nfs-volume-source-spec
   (ds/opt :persistentVolumeClaim) v1/persistent-volume-claim-volume-source-spec
   (ds/opt :photonPersistentDisk) v1/photon-persistent-disk-volume-source-spec
   (ds/opt :portworxVolume) v1/portworx-volume-source-spec
   (ds/opt :projected) v1/projected-volume-source-spec
   (ds/opt :quobyte) v1/quobyte-volume-source-spec
   (ds/opt :rbd) v1/rbd-volume-source-spec
   (ds/opt :scaleIO) v1/scale-io-volume-source-spec
   (ds/opt :secret) v1/secret-volume-source-spec
   (ds/opt :storageos) v1/storage-os-volume-source-spec
   (ds/opt :vsphereVolume) v1/vsphere-virtual-disk-volume-source-spec
   })

(def v1/volume-spec
  (ds/spec
    {:name ::v1/volume
     :spec v1/volume-data}))
