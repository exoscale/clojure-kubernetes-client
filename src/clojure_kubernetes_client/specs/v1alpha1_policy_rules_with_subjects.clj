(ns clojure-kubernetes-client.specs.v1alpha1-policy-rules-with-subjects
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-non-resource-policy-rule :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-resource-policy-rule :refer :all]
            [clojure-kubernetes-client.specs.flowcontrol-v1alpha1-subject :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-policy-rules-with-subjects-data v1alpha1-policy-rules-with-subjects)
(def v1alpha1-policy-rules-with-subjects-data
  {
   (ds/opt :nonResourceRules) (s/coll-of v1alpha1-non-resource-policy-rule)
   (ds/opt :resourceRules) (s/coll-of v1alpha1-resource-policy-rule)
   (ds/req :subjects) (s/coll-of flowcontrol-v1alpha1-subject)
   })

(def v1alpha1-policy-rules-with-subjects
  (ds/spec
    {:name ::v1alpha1-policy-rules-with-subjects
     :spec v1alpha1-policy-rules-with-subjects-data}))

