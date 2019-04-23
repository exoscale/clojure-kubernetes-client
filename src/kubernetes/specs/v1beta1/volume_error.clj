(ns kubernetes.specs.v1beta1/volume-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/volume-error-data
  {
   (ds/opt :message) string?
   (ds/opt :time) inst?
   })

(def v1beta1/volume-error-spec
  (ds/spec
    {:name ::v1beta1/volume-error
     :spec v1beta1/volume-error-data}))
