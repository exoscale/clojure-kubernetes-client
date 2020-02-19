(ns clojure-kubernetes-client.specs.v1alpha1-limit-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-queuing-configuration :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-limit-response-data v1alpha1-limit-response)
(def v1alpha1-limit-response-data
  {
   (ds/opt :queuing) v1alpha1-queuing-configuration
   (ds/req :type) string?
   })

(def v1alpha1-limit-response
  (ds/spec
    {:name ::v1alpha1-limit-response
     :spec v1alpha1-limit-response-data}))

