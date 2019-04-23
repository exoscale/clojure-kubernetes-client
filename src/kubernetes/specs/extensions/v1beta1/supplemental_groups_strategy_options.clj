(ns kubernetes.specs.extensions/v1beta1/supplemental-groups-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/id-range :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/supplemental-groups-strategy-options-data
  {
   (ds/opt :ranges) (s/coll-of extensions/v1beta1/id-range-spec)
   (ds/opt :rule) string?
   })

(def extensions/v1beta1/supplemental-groups-strategy-options-spec
  (ds/spec
    {:name ::extensions/v1beta1/supplemental-groups-strategy-options
     :spec extensions/v1beta1/supplemental-groups-strategy-options-data}))
