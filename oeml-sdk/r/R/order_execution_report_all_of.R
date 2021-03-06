# OEML - REST API
#
# This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
#
# The version of the OpenAPI document: v1
# Contact: support@coinapi.io
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title OrderExecutionReportAllOf
#' @description OrderExecutionReportAllOf Class
#' @format An \code{R6Class} generator object
#' @field client_order_id_format_exchange  character 
#'
#' @field exchange_order_id  character [optional]
#'
#' @field amount_open  numeric 
#'
#' @field amount_filled  numeric 
#'
#' @field status  \link{OrdStatus} 
#'
#' @field time_order  list( \link{array[character]} ) 
#'
#' @field error_message  character [optional]
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderExecutionReportAllOf <- R6::R6Class(
  'OrderExecutionReportAllOf',
  public = list(
    `client_order_id_format_exchange` = NULL,
    `exchange_order_id` = NULL,
    `amount_open` = NULL,
    `amount_filled` = NULL,
    `status` = NULL,
    `time_order` = NULL,
    `error_message` = NULL,
    initialize = function(`client_order_id_format_exchange`, `amount_open`, `amount_filled`, `status`, `time_order`, `exchange_order_id`=NULL, `error_message`=NULL, ...){
      local.optional.var <- list(...)
      if (!missing(`client_order_id_format_exchange`)) {
        stopifnot(is.character(`client_order_id_format_exchange`), length(`client_order_id_format_exchange`) == 1)
        self$`client_order_id_format_exchange` <- `client_order_id_format_exchange`
      }
      if (!missing(`amount_open`)) {
        self$`amount_open` <- `amount_open`
      }
      if (!missing(`amount_filled`)) {
        self$`amount_filled` <- `amount_filled`
      }
      if (!missing(`status`)) {
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!missing(`time_order`)) {
        stopifnot(is.vector(`time_order`), length(`time_order`) != 0)
        sapply(`time_order`, function(x) stopifnot(R6::is.R6(x)))
        self$`time_order` <- `time_order`
      }
      if (!is.null(`exchange_order_id`)) {
        stopifnot(is.character(`exchange_order_id`), length(`exchange_order_id`) == 1)
        self$`exchange_order_id` <- `exchange_order_id`
      }
      if (!is.null(`error_message`)) {
        stopifnot(is.character(`error_message`), length(`error_message`) == 1)
        self$`error_message` <- `error_message`
      }
    },
    toJSON = function() {
      OrderExecutionReportAllOfObject <- list()
      if (!is.null(self$`client_order_id_format_exchange`)) {
        OrderExecutionReportAllOfObject[['client_order_id_format_exchange']] <-
          self$`client_order_id_format_exchange`
      }
      if (!is.null(self$`exchange_order_id`)) {
        OrderExecutionReportAllOfObject[['exchange_order_id']] <-
          self$`exchange_order_id`
      }
      if (!is.null(self$`amount_open`)) {
        OrderExecutionReportAllOfObject[['amount_open']] <-
          self$`amount_open`
      }
      if (!is.null(self$`amount_filled`)) {
        OrderExecutionReportAllOfObject[['amount_filled']] <-
          self$`amount_filled`
      }
      if (!is.null(self$`status`)) {
        OrderExecutionReportAllOfObject[['status']] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`time_order`)) {
        OrderExecutionReportAllOfObject[['time_order']] <-
          lapply(self$`time_order`, function(x) x$toJSON())
      }
      if (!is.null(self$`error_message`)) {
        OrderExecutionReportAllOfObject[['error_message']] <-
          self$`error_message`
      }

      OrderExecutionReportAllOfObject
    },
    fromJSON = function(OrderExecutionReportAllOfJson) {
      OrderExecutionReportAllOfObject <- jsonlite::fromJSON(OrderExecutionReportAllOfJson)
      if (!is.null(OrderExecutionReportAllOfObject$`client_order_id_format_exchange`)) {
        self$`client_order_id_format_exchange` <- OrderExecutionReportAllOfObject$`client_order_id_format_exchange`
      }
      if (!is.null(OrderExecutionReportAllOfObject$`exchange_order_id`)) {
        self$`exchange_order_id` <- OrderExecutionReportAllOfObject$`exchange_order_id`
      }
      if (!is.null(OrderExecutionReportAllOfObject$`amount_open`)) {
        self$`amount_open` <- OrderExecutionReportAllOfObject$`amount_open`
      }
      if (!is.null(OrderExecutionReportAllOfObject$`amount_filled`)) {
        self$`amount_filled` <- OrderExecutionReportAllOfObject$`amount_filled`
      }
      if (!is.null(OrderExecutionReportAllOfObject$`status`)) {
        statusObject <- OrdStatus$new()
        statusObject$fromJSON(jsonlite::toJSON(OrderExecutionReportAllOfObject$status, auto_unbox = TRUE, digits = NA))
        self$`status` <- statusObject
      }
      if (!is.null(OrderExecutionReportAllOfObject$`time_order`)) {
        self$`time_order` <- ApiClient$new()$deserializeObj(OrderExecutionReportAllOfObject$`time_order`, "array[array[character]]", loadNamespace("openapi"))
      }
      if (!is.null(OrderExecutionReportAllOfObject$`error_message`)) {
        self$`error_message` <- OrderExecutionReportAllOfObject$`error_message`
      }
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`client_order_id_format_exchange`)) {
        sprintf(
        '"client_order_id_format_exchange":
          "%s"
                ',
        self$`client_order_id_format_exchange`
        )},
        if (!is.null(self$`exchange_order_id`)) {
        sprintf(
        '"exchange_order_id":
          "%s"
                ',
        self$`exchange_order_id`
        )},
        if (!is.null(self$`amount_open`)) {
        sprintf(
        '"amount_open":
          %d
                ',
        self$`amount_open`
        )},
        if (!is.null(self$`amount_filled`)) {
        sprintf(
        '"amount_filled":
          %d
                ',
        self$`amount_filled`
        )},
        if (!is.null(self$`status`)) {
        sprintf(
        '"status":
        %s
        ',
        jsonlite::toJSON(self$`status`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`time_order`)) {
        sprintf(
        '"time_order":
        [%s]
',
        paste(sapply(self$`time_order`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE, digits = NA)), collapse=",")
        )},
        if (!is.null(self$`error_message`)) {
        sprintf(
        '"error_message":
          "%s"
                ',
        self$`error_message`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(OrderExecutionReportAllOfJson) {
      OrderExecutionReportAllOfObject <- jsonlite::fromJSON(OrderExecutionReportAllOfJson)
      self$`client_order_id_format_exchange` <- OrderExecutionReportAllOfObject$`client_order_id_format_exchange`
      self$`exchange_order_id` <- OrderExecutionReportAllOfObject$`exchange_order_id`
      self$`amount_open` <- OrderExecutionReportAllOfObject$`amount_open`
      self$`amount_filled` <- OrderExecutionReportAllOfObject$`amount_filled`
      self$`status` <- OrdStatus$new()$fromJSON(jsonlite::toJSON(OrderExecutionReportAllOfObject$status, auto_unbox = TRUE, digits = NA))
      self$`time_order` <- ApiClient$new()$deserializeObj(OrderExecutionReportAllOfObject$`time_order`, "array[array[character]]", loadNamespace("openapi"))
      self$`error_message` <- OrderExecutionReportAllOfObject$`error_message`
      self
    }
  )
)
