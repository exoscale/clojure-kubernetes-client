(ns clojure-kubernetes-client.specs.v1-persistent-volume-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-aws-elastic-block-store-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-azure-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-azure-file-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-ceph-fs-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-cinder-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-fc-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-flex-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-flocker-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-gce-persistent-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-glusterfs-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-host-path-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-iscsi-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-local-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-nfs-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-node-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1-photon-persistent-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-portworx-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-quobyte-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-rbd-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-scale-io-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-storage-os-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-vsphere-virtual-disk-volume-source :refer :all]
            )
  (:import (java.io File)))


(declare v1-persistent-volume-spec-data v1-persistent-volume-spec)
(def v1-persistent-volume-spec-data
  {
   (ds/opt :accessModes) (s/coll-of string?)
   (ds/opt :awsElasticBlockStore) v1-aws-elastic-block-store-volume-source
   (ds/opt :azureDisk) v1-azure-disk-volume-source
   (ds/opt :azureFile) v1-azure-file-persistent-volume-source
   (ds/opt :capacity) (s/map-of string? string?)
   (ds/opt :cephfs) v1-ceph-fs-persistent-volume-source
   (ds/opt :cinder) v1-cinder-persistent-volume-source
   (ds/opt :claimRef) v1-object-reference
   (ds/opt :csi) v1-csi-persistent-volume-source
   (ds/opt :fc) v1-fc-volume-source
   (ds/opt :flexVolume) v1-flex-persistent-volume-source
   (ds/opt :flocker) v1-flocker-volume-source
   (ds/opt :gcePersistentDisk) v1-gce-persistent-disk-volume-source
   (ds/opt :glusterfs) v1-glusterfs-persistent-volume-source
   (ds/opt :hostPath) v1-host-path-volume-source
   (ds/opt :iscsi) v1-iscsi-persistent-volume-source
   (ds/opt :local) v1-local-volume-source
   (ds/opt :mountOptions) (s/coll-of string?)
   (ds/opt :nfs) v1-nfs-volume-source
   (ds/opt :nodeAffinity) v1-volume-node-affinity
   (ds/opt :persistentVolumeReclaimPolicy) string?
   (ds/opt :photonPersistentDisk) v1-photon-persistent-disk-volume-source
   (ds/opt :portworxVolume) v1-portworx-volume-source
   (ds/opt :quobyte) v1-quobyte-volume-source
   (ds/opt :rbd) v1-rbd-persistent-volume-source
   (ds/opt :scaleIO) v1-scale-io-persistent-volume-source
   (ds/opt :storageClassName) string?
   (ds/opt :storageos) v1-storage-os-persistent-volume-source
   (ds/opt :volumeMode) string?
   (ds/opt :vsphereVolume) v1-vsphere-virtual-disk-volume-source
   })

(def v1-persistent-volume-spec
  (ds/spec
    {:name ::v1-persistent-volume-spec
     :spec v1-persistent-volume-spec-data}))

