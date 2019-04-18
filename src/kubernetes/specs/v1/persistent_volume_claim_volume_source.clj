(ns kubernetes.specs.v1/persistent-volume-claim-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/persistent-volume-claim-volume-source-data
  {
   (ds/req :claimName) string?
   (ds/opt :readOnly) boolean?
   })

(def v1/persistent-volume-claim-volume-source-spec
  (ds/spec
    {:name ::v1/persistent-volume-claim-volume-source
     :spec v1/persistent-volume-claim-volume-source-data}))
