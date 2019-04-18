(ns kubernetes.specs.v1/persistent-volume-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/aws-elastic-block-store-volume-source :refer :all]
            [kubernetes.specs.v1/azure-disk-volume-source :refer :all]
            [kubernetes.specs.v1/azure-file-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/ceph-fs-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/cinder-volume-source :refer :all]
            [kubernetes.specs.v1/object-reference :refer :all]
            [kubernetes.specs.v1/fc-volume-source :refer :all]
            [kubernetes.specs.v1/flex-volume-source :refer :all]
            [kubernetes.specs.v1/flocker-volume-source :refer :all]
            [kubernetes.specs.v1/gce-persistent-disk-volume-source :refer :all]
            [kubernetes.specs.v1/glusterfs-volume-source :refer :all]
            [kubernetes.specs.v1/host-path-volume-source :refer :all]
            [kubernetes.specs.v1/iscsi-volume-source :refer :all]
            [kubernetes.specs.v1/local-volume-source :refer :all]
            [kubernetes.specs.v1/nfs-volume-source :refer :all]
            [kubernetes.specs.v1/photon-persistent-disk-volume-source :refer :all]
            [kubernetes.specs.v1/portworx-volume-source :refer :all]
            [kubernetes.specs.v1/quobyte-volume-source :refer :all]
            [kubernetes.specs.v1/rbd-volume-source :refer :all]
            [kubernetes.specs.v1/scale-io-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/storage-os-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/vsphere-virtual-disk-volume-source :refer :all]
            )
  (:import (java.io File)))


(def v1/persistent-volume-spec-data
  {
   (ds/opt :accessModes) (s/coll-of string?)
   (ds/opt :awsElasticBlockStore) v1/aws-elastic-block-store-volume-source-spec
   (ds/opt :azureDisk) v1/azure-disk-volume-source-spec
   (ds/opt :azureFile) v1/azure-file-persistent-volume-source-spec
   (ds/opt :capacity) (s/map-of string? string?)
   (ds/opt :cephfs) v1/ceph-fs-persistent-volume-source-spec
   (ds/opt :cinder) v1/cinder-volume-source-spec
   (ds/opt :claimRef) v1/object-reference-spec
   (ds/opt :fc) v1/fc-volume-source-spec
   (ds/opt :flexVolume) v1/flex-volume-source-spec
   (ds/opt :flocker) v1/flocker-volume-source-spec
   (ds/opt :gcePersistentDisk) v1/gce-persistent-disk-volume-source-spec
   (ds/opt :glusterfs) v1/glusterfs-volume-source-spec
   (ds/opt :hostPath) v1/host-path-volume-source-spec
   (ds/opt :iscsi) v1/iscsi-volume-source-spec
   (ds/opt :local) v1/local-volume-source-spec
   (ds/opt :mountOptions) (s/coll-of string?)
   (ds/opt :nfs) v1/nfs-volume-source-spec
   (ds/opt :persistentVolumeReclaimPolicy) string?
   (ds/opt :photonPersistentDisk) v1/photon-persistent-disk-volume-source-spec
   (ds/opt :portworxVolume) v1/portworx-volume-source-spec
   (ds/opt :quobyte) v1/quobyte-volume-source-spec
   (ds/opt :rbd) v1/rbd-volume-source-spec
   (ds/opt :scaleIO) v1/scale-io-persistent-volume-source-spec
   (ds/opt :storageClassName) string?
   (ds/opt :storageos) v1/storage-os-persistent-volume-source-spec
   (ds/opt :vsphereVolume) v1/vsphere-virtual-disk-volume-source-spec
   })

(def v1/persistent-volume-spec-spec
  (ds/spec
    {:name ::v1/persistent-volume-spec
     :spec v1/persistent-volume-spec-data}))
