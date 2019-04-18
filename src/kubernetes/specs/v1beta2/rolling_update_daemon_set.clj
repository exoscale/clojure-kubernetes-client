(ns kubernetes.specs.v1beta2/rolling-update-daemon-set
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1beta2/rolling-update-daemon-set-data
  {
   (ds/opt :maxUnavailable) any?
   })

(def v1beta2/rolling-update-daemon-set-spec
  (ds/spec
    {:name ::v1beta2/rolling-update-daemon-set
     :spec v1beta2/rolling-update-daemon-set-data}))
