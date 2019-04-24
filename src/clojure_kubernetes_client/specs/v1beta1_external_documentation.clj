(ns clojure-kubernetes-client.specs.v1beta1-external-documentation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-external-documentation-data v1beta1-external-documentation)
(def v1beta1-external-documentation-data
  {
   (ds/opt :description) string?
   (ds/opt :url) string?
   })

(def v1beta1-external-documentation
  (ds/spec
    {:name ::v1beta1-external-documentation
     :spec v1beta1-external-documentation-data}))

