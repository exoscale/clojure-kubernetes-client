(ns kubernetes.specs.v1alpha1/volume-attachment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/volume-error :refer :all]
            [kubernetes.specs.v1alpha1/volume-error :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/volume-attachment-status-data
  {
   (ds/opt :attachError) v1alpha1/volume-error-spec
   (ds/req :attached) boolean?
   (ds/opt :attachmentMetadata) (s/map-of string? string?)
   (ds/opt :detachError) v1alpha1/volume-error-spec
   })

(def v1alpha1/volume-attachment-status-spec
  (ds/spec
    {:name ::v1alpha1/volume-attachment-status
     :spec v1alpha1/volume-attachment-status-data}))
