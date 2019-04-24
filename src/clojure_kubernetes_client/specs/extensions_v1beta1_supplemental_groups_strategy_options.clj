(ns clojure-kubernetes-client.specs.extensions-v1beta1-supplemental-groups-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-id-range :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-supplemental-groups-strategy-options-data extensions-v1beta1-supplemental-groups-strategy-options)
(def extensions-v1beta1-supplemental-groups-strategy-options-data
  {
   (ds/opt :ranges) (s/coll-of extensions-v1beta1-id-range)
   (ds/opt :rule) string?
   })

(def extensions-v1beta1-supplemental-groups-strategy-options
  (ds/spec
    {:name ::extensions-v1beta1-supplemental-groups-strategy-options
     :spec extensions-v1beta1-supplemental-groups-strategy-options-data}))

