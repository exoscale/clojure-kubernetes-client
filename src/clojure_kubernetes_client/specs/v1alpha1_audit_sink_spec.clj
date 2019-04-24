(ns clojure-kubernetes-client.specs.v1alpha1-audit-sink-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-policy :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-webhook :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-audit-sink-spec-data v1alpha1-audit-sink-spec)
(def v1alpha1-audit-sink-spec-data
  {
   (ds/req :policy) v1alpha1-policy
   (ds/req :webhook) v1alpha1-webhook
   })

(def v1alpha1-audit-sink-spec
  (ds/spec
    {:name ::v1alpha1-audit-sink-spec
     :spec v1alpha1-audit-sink-spec-data}))

