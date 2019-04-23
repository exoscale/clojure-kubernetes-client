(ns kubernetes.specs.v1alpha1/volume-attachment-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/volume-attachment-source :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/volume-attachment-spec-data
  {
   (ds/req :attacher) string?
   (ds/req :nodeName) string?
   (ds/req :source) v1alpha1/volume-attachment-source-spec
   })

(def v1alpha1/volume-attachment-spec-spec
  (ds/spec
    {:name ::v1alpha1/volume-attachment-spec
     :spec v1alpha1/volume-attachment-spec-data}))
