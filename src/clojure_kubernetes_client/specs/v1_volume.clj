(ns clojure-kubernetes-client.specs.v1-volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-aws-elastic-block-store-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-azure-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-azure-file-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-ceph-fs-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-cinder-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-config-map-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-downward-api-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-empty-dir-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-fc-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-flex-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-flocker-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-gce-persistent-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-git-repo-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-glusterfs-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-host-path-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-iscsi-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-nfs-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-photon-persistent-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-portworx-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-projected-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-quobyte-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-rbd-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-scale-io-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-storage-os-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-vsphere-virtual-disk-volume-source :refer :all]
            )
  (:import (java.io File)))


(declare v1-volume-data v1-volume)
(def v1-volume-data
  {
   (ds/opt :awsElasticBlockStore) v1-aws-elastic-block-store-volume-source
   (ds/opt :azureDisk) v1-azure-disk-volume-source
   (ds/opt :azureFile) v1-azure-file-volume-source
   (ds/opt :cephfs) v1-ceph-fs-volume-source
   (ds/opt :cinder) v1-cinder-volume-source
   (ds/opt :configMap) v1-config-map-volume-source
   (ds/opt :csi) v1-csi-volume-source
   (ds/opt :downwardAPI) v1-downward-api-volume-source
   (ds/opt :emptyDir) v1-empty-dir-volume-source
   (ds/opt :fc) v1-fc-volume-source
   (ds/opt :flexVolume) v1-flex-volume-source
   (ds/opt :flocker) v1-flocker-volume-source
   (ds/opt :gcePersistentDisk) v1-gce-persistent-disk-volume-source
   (ds/opt :gitRepo) v1-git-repo-volume-source
   (ds/opt :glusterfs) v1-glusterfs-volume-source
   (ds/opt :hostPath) v1-host-path-volume-source
   (ds/opt :iscsi) v1-iscsi-volume-source
   (ds/req :name) string?
   (ds/opt :nfs) v1-nfs-volume-source
   (ds/opt :persistentVolumeClaim) v1-persistent-volume-claim-volume-source
   (ds/opt :photonPersistentDisk) v1-photon-persistent-disk-volume-source
   (ds/opt :portworxVolume) v1-portworx-volume-source
   (ds/opt :projected) v1-projected-volume-source
   (ds/opt :quobyte) v1-quobyte-volume-source
   (ds/opt :rbd) v1-rbd-volume-source
   (ds/opt :scaleIO) v1-scale-io-volume-source
   (ds/opt :secret) v1-secret-volume-source
   (ds/opt :storageos) v1-storage-os-volume-source
   (ds/opt :vsphereVolume) v1-vsphere-virtual-disk-volume-source
   })

(def v1-volume
  (ds/spec
    {:name ::v1-volume
     :spec v1-volume-data}))

