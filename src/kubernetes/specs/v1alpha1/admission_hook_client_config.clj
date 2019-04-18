(ns kubernetes.specs.v1alpha1/admission-hook-client-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/service-reference :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/admission-hook-client-config-data
  {
   (ds/req :caBundle) any?
   (ds/req :service) v1alpha1/service-reference-spec
   })

(def v1alpha1/admission-hook-client-config-spec
  (ds/spec
    {:name ::v1alpha1/admission-hook-client-config
     :spec v1alpha1/admission-hook-client-config-data}))
