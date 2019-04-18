(ns kubernetes.specs.v1/container-state
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/container-state-running :refer :all]
            [kubernetes.specs.v1/container-state-terminated :refer :all]
            [kubernetes.specs.v1/container-state-waiting :refer :all]
            )
  (:import (java.io File)))


(def v1/container-state-data
  {
   (ds/opt :running) v1/container-state-running-spec
   (ds/opt :terminated) v1/container-state-terminated-spec
   (ds/opt :waiting) v1/container-state-waiting-spec
   })

(def v1/container-state-spec
  (ds/spec
    {:name ::v1/container-state
     :spec v1/container-state-data}))
