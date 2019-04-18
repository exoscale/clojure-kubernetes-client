(ns kubernetes.specs.v1/flex-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/local-object-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/flex-volume-source-data
  {
   (ds/req :driver) string?
   (ds/opt :fsType) string?
   (ds/opt :options) (s/map-of string? string?)
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1/local-object-reference-spec
   })

(def v1/flex-volume-source-spec
  (ds/spec
    {:name ::v1/flex-volume-source
     :spec v1/flex-volume-source-data}))
