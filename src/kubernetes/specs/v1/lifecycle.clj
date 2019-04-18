(ns kubernetes.specs.v1/lifecycle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/handler :refer :all]
            [kubernetes.specs.v1/handler :refer :all]
            )
  (:import (java.io File)))


(def v1/lifecycle-data
  {
   (ds/opt :postStart) v1/handler-spec
   (ds/opt :preStop) v1/handler-spec
   })

(def v1/lifecycle-spec
  (ds/spec
    {:name ::v1/lifecycle
     :spec v1/lifecycle-data}))
