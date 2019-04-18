(ns kubernetes.specs.v1beta1/external-documentation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/external-documentation-data
  {
   (ds/opt :description) string?
   (ds/opt :url) string?
   })

(def v1beta1/external-documentation-spec
  (ds/spec
    {:name ::v1beta1/external-documentation
     :spec v1beta1/external-documentation-data}))
