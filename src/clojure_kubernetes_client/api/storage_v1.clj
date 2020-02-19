(ns clojure-kubernetes-client.api.storage-v1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1-csi-node :refer :all]

            [clojure-kubernetes-client.specs.v1-storage-class :refer :all]

            [clojure-kubernetes-client.specs.v1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1-csi-node-list :refer :all]

            [clojure-kubernetes-client.specs.v1-storage-class-list :refer :all]

            [clojure-kubernetes-client.specs.v1-volume-attachment-list :refer :all]

            [clojure-kubernetes-client.specs.v1-csi-node :refer :all]

            [clojure-kubernetes-client.specs.v1-storage-class :refer :all]

            [clojure-kubernetes-client.specs.v1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1-csi-node :refer :all]

            [clojure-kubernetes-client.specs.v1-storage-class :refer :all]

            [clojure-kubernetes-client.specs.v1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1-csi-node :refer :all]

            [clojure-kubernetes-client.specs.v1-storage-class :refer :all]

            [clojure-kubernetes-client.specs.v1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1-volume-attachment :refer :all]
)
  (:import (java.io File)))


(defn-spec create-csi-node-with-http-info any?
  "
  create a CSINode"
  ([body v1-csi-node, ] (create-csi-node-with-http-info body nil))
  ([body v1-csi-node, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/storage.k8s.io/v1/csinodes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-csi-node v1-csi-node
  "
  create a CSINode"
  ([body v1-csi-node, ] (create-csi-node body nil))
  ([body v1-csi-node, optional-params any?]
   (let [res (:data (create-csi-node-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-csi-node res st/string-transformer)
        res))))


(defn-spec create-storage-class-with-http-info any?
  "
  create a StorageClass"
  ([body v1-storage-class, ] (create-storage-class-with-http-info body nil))
  ([body v1-storage-class, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/storage.k8s.io/v1/storageclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-storage-class v1-storage-class
  "
  create a StorageClass"
  ([body v1-storage-class, ] (create-storage-class body nil))
  ([body v1-storage-class, optional-params any?]
   (let [res (:data (create-storage-class-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-storage-class res st/string-transformer)
        res))))


(defn-spec create-volume-attachment-with-http-info any?
  "
  create a VolumeAttachment"
  ([body v1-volume-attachment, ] (create-volume-attachment-with-http-info body nil))
  ([body v1-volume-attachment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/storage.k8s.io/v1/volumeattachments" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-volume-attachment v1-volume-attachment
  "
  create a VolumeAttachment"
  ([body v1-volume-attachment, ] (create-volume-attachment body nil))
  ([body v1-volume-attachment, optional-params any?]
   (let [res (:data (create-volume-attachment-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-volume-attachment res st/string-transformer)
        res))))


(defn-spec delete-collection-csi-node-with-http-info any?
  "
  delete collection of CSINode"
  ([] (delete-collection-csi-node-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/storage.k8s.io/v1/csinodes" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-csi-node v1-status
  "
  delete collection of CSINode"
  ([] (delete-collection-csi-node nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-csi-node-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-storage-class-with-http-info any?
  "
  delete collection of StorageClass"
  ([] (delete-collection-storage-class-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/storage.k8s.io/v1/storageclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-storage-class v1-status
  "
  delete collection of StorageClass"
  ([] (delete-collection-storage-class nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-storage-class-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-volume-attachment-with-http-info any?
  "
  delete collection of VolumeAttachment"
  ([] (delete-collection-volume-attachment-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-volume-attachment v1-status
  "
  delete collection of VolumeAttachment"
  ([] (delete-collection-volume-attachment nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-volume-attachment-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-csi-node-with-http-info any?
  "
  delete a CSINode"
  ([name string?, ] (delete-csi-node-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1/csinodes/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-csi-node v1-status
  "
  delete a CSINode"
  ([name string?, ] (delete-csi-node name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-csi-node-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-storage-class-with-http-info any?
  "
  delete a StorageClass"
  ([name string?, ] (delete-storage-class-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1/storageclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-storage-class v1-status
  "
  delete a StorageClass"
  ([name string?, ] (delete-storage-class name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-storage-class-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-volume-attachment-with-http-info any?
  "
  delete a VolumeAttachment"
  ([name string?, ] (delete-volume-attachment-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-volume-attachment v1-status
  "
  delete a VolumeAttachment"
  ([name string?, ] (delete-volume-attachment name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-volume-attachment-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/storage.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-api-resources v1-api-resource-list
  "
  get available resources"
  []
  (let [res (:data (get-api-resources-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode v1-api-resource-list res st/string-transformer)
       res)))


(defn-spec list-csi-node-with-http-info any?
  "
  list or watch objects of kind CSINode"
  ([] (list-csi-node-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/storage.k8s.io/v1/csinodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-csi-node v1-csi-node-list
  "
  list or watch objects of kind CSINode"
  ([] (list-csi-node nil))
  ([optional-params any?]
   (let [res (:data (list-csi-node-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-csi-node-list res st/string-transformer)
        res))))


(defn-spec list-storage-class-with-http-info any?
  "
  list or watch objects of kind StorageClass"
  ([] (list-storage-class-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/storage.k8s.io/v1/storageclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-storage-class v1-storage-class-list
  "
  list or watch objects of kind StorageClass"
  ([] (list-storage-class nil))
  ([optional-params any?]
   (let [res (:data (list-storage-class-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-storage-class-list res st/string-transformer)
        res))))


(defn-spec list-volume-attachment-with-http-info any?
  "
  list or watch objects of kind VolumeAttachment"
  ([] (list-volume-attachment-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-volume-attachment v1-volume-attachment-list
  "
  list or watch objects of kind VolumeAttachment"
  ([] (list-volume-attachment nil))
  ([optional-params any?]
   (let [res (:data (list-volume-attachment-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-volume-attachment-list res st/string-transformer)
        res))))


(defn-spec patch-csi-node-with-http-info any?
  "
  partially update the specified CSINode"
  ([name string?, body any?, ] (patch-csi-node-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1/csinodes/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-csi-node v1-csi-node
  "
  partially update the specified CSINode"
  ([name string?, body any?, ] (patch-csi-node name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-csi-node-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-csi-node res st/string-transformer)
        res))))


(defn-spec patch-storage-class-with-http-info any?
  "
  partially update the specified StorageClass"
  ([name string?, body any?, ] (patch-storage-class-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1/storageclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-storage-class v1-storage-class
  "
  partially update the specified StorageClass"
  ([name string?, body any?, ] (patch-storage-class name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-storage-class-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-storage-class res st/string-transformer)
        res))))


(defn-spec patch-volume-attachment-with-http-info any?
  "
  partially update the specified VolumeAttachment"
  ([name string?, body any?, ] (patch-volume-attachment-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-volume-attachment v1-volume-attachment
  "
  partially update the specified VolumeAttachment"
  ([name string?, body any?, ] (patch-volume-attachment name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-volume-attachment-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-volume-attachment res st/string-transformer)
        res))))


(defn-spec patch-volume-attachment-status-with-http-info any?
  "
  partially update status of the specified VolumeAttachment"
  ([name string?, body any?, ] (patch-volume-attachment-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-volume-attachment-status v1-volume-attachment
  "
  partially update status of the specified VolumeAttachment"
  ([name string?, body any?, ] (patch-volume-attachment-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-volume-attachment-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-volume-attachment res st/string-transformer)
        res))))


(defn-spec read-csi-node-with-http-info any?
  "
  read the specified CSINode"
  ([name string?, ] (read-csi-node-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1/csinodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-csi-node v1-csi-node
  "
  read the specified CSINode"
  ([name string?, ] (read-csi-node name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-csi-node-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-csi-node res st/string-transformer)
        res))))


(defn-spec read-storage-class-with-http-info any?
  "
  read the specified StorageClass"
  ([name string?, ] (read-storage-class-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1/storageclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-storage-class v1-storage-class
  "
  read the specified StorageClass"
  ([name string?, ] (read-storage-class name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-storage-class-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-storage-class res st/string-transformer)
        res))))


(defn-spec read-volume-attachment-with-http-info any?
  "
  read the specified VolumeAttachment"
  ([name string?, ] (read-volume-attachment-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-volume-attachment v1-volume-attachment
  "
  read the specified VolumeAttachment"
  ([name string?, ] (read-volume-attachment name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-volume-attachment-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-volume-attachment res st/string-transformer)
        res))))


(defn-spec read-volume-attachment-status-with-http-info any?
  "
  read status of the specified VolumeAttachment"
  ([name string?, ] (read-volume-attachment-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-volume-attachment-status v1-volume-attachment
  "
  read status of the specified VolumeAttachment"
  ([name string?, ] (read-volume-attachment-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-volume-attachment-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-volume-attachment res st/string-transformer)
        res))))


(defn-spec replace-csi-node-with-http-info any?
  "
  replace the specified CSINode"
  ([name string?, body v1-csi-node, ] (replace-csi-node-with-http-info name body nil))
  ([name string?, body v1-csi-node, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1/csinodes/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-csi-node v1-csi-node
  "
  replace the specified CSINode"
  ([name string?, body v1-csi-node, ] (replace-csi-node name body nil))
  ([name string?, body v1-csi-node, optional-params any?]
   (let [res (:data (replace-csi-node-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-csi-node res st/string-transformer)
        res))))


(defn-spec replace-storage-class-with-http-info any?
  "
  replace the specified StorageClass"
  ([name string?, body v1-storage-class, ] (replace-storage-class-with-http-info name body nil))
  ([name string?, body v1-storage-class, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1/storageclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-storage-class v1-storage-class
  "
  replace the specified StorageClass"
  ([name string?, body v1-storage-class, ] (replace-storage-class name body nil))
  ([name string?, body v1-storage-class, optional-params any?]
   (let [res (:data (replace-storage-class-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-storage-class res st/string-transformer)
        res))))


(defn-spec replace-volume-attachment-with-http-info any?
  "
  replace the specified VolumeAttachment"
  ([name string?, body v1-volume-attachment, ] (replace-volume-attachment-with-http-info name body nil))
  ([name string?, body v1-volume-attachment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-volume-attachment v1-volume-attachment
  "
  replace the specified VolumeAttachment"
  ([name string?, body v1-volume-attachment, ] (replace-volume-attachment name body nil))
  ([name string?, body v1-volume-attachment, optional-params any?]
   (let [res (:data (replace-volume-attachment-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-volume-attachment res st/string-transformer)
        res))))


(defn-spec replace-volume-attachment-status-with-http-info any?
  "
  replace status of the specified VolumeAttachment"
  ([name string?, body v1-volume-attachment, ] (replace-volume-attachment-status-with-http-info name body nil))
  ([name string?, body v1-volume-attachment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-volume-attachment-status v1-volume-attachment
  "
  replace status of the specified VolumeAttachment"
  ([name string?, body v1-volume-attachment, ] (replace-volume-attachment-status name body nil))
  ([name string?, body v1-volume-attachment, optional-params any?]
   (let [res (:data (replace-volume-attachment-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-volume-attachment res st/string-transformer)
        res))))


