(ns kubernetes.specs.v1beta1/supplemental-groups-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/id-range :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/supplemental-groups-strategy-options-data
  {
   (ds/opt :ranges) (s/coll-of v1beta1/id-range-spec)
   (ds/opt :rule) string?
   })

(def v1beta1/supplemental-groups-strategy-options-spec
  (ds/spec
    {:name ::v1beta1/supplemental-groups-strategy-options
     :spec v1beta1/supplemental-groups-strategy-options-data}))
