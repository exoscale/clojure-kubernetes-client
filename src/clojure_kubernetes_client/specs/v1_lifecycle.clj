(ns clojure-kubernetes-client.specs.v1-lifecycle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-handler :refer :all]
            [clojure-kubernetes-client.specs.v1-handler :refer :all]
            )
  (:import (java.io File)))


(declare v1-lifecycle-data v1-lifecycle)
(def v1-lifecycle-data
  {
   (ds/opt :postStart) v1-handler
   (ds/opt :preStop) v1-handler
   })

(def v1-lifecycle
  (ds/spec
    {:name ::v1-lifecycle
     :spec v1-lifecycle-data}))

