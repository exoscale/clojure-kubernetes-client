(ns kubernetes.specs.v1beta1/job-template-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/job-spec :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/job-template-spec-data
  {
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/job-spec-spec
   })

(def v1beta1/job-template-spec-spec
  (ds/spec
    {:name ::v1beta1/job-template-spec
     :spec v1beta1/job-template-spec-data}))
