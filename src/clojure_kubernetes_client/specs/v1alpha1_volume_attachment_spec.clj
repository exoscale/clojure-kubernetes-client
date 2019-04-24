(ns clojure-kubernetes-client.specs.v1alpha1-volume-attachment-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment-source :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-volume-attachment-spec-data v1alpha1-volume-attachment-spec)
(def v1alpha1-volume-attachment-spec-data
  {
   (ds/req :attacher) string?
   (ds/req :nodeName) string?
   (ds/req :source) v1alpha1-volume-attachment-source
   })

(def v1alpha1-volume-attachment-spec
  (ds/spec
    {:name ::v1alpha1-volume-attachment-spec
     :spec v1alpha1-volume-attachment-spec-data}))

