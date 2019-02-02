package com.example.myapplication.retrofit

import java.util.HashMap

import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.PartMap
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by User on 4/13/2017.
 */

class APIinterFace {

    //LOGIN TO APP
    interface RB_loginVendor {

        @POST("integration/seller/token")
        fun responce(
                @Query("username") username: String,
                @Query("password") password: String
        ): Call<ResponseBody>
    }


    /*@Query("region_id") String region_id,
    @Query("region") String region,
    @Query("pickup_region_id") String pickup_region_id,
    @Query("pickup_region") String pickup_region*/


    //SAVE EDITED PROFILE INFO ON SERVER
    interface RB_saveAccountInfo {

        @POST("seller/updateAccountInformation")
        fun responce(
                @Header("Authorization") token: String,
                @Query("section") section: String,
                @Query("name") name: String,
                @Query("address1") address1: String,
                @Query("address2") address2: String,
                @Query("country_id") country_id: String,
                @Query("region") region: String,
                @Query("city") city: String,
                @Query("pincode") pincode: String
                /* @Field("business_name") String business_name,
                @Field("display_name") String display_name,
                @Field("cr_number") String cr_number,
                @Field("pickup_address1") String pickup_address1,
                @Field("pickup_address2") String pickup_address2,
                @Field("pickup_city") String pickup_city,
                @Field("pickup_pincode") String pickup_pincode,
                @Field("bank_account_name") String bank_account_name,
                @Field("bank_account_number") String bank_account_number,
                @Field("Re-type Account Number") String retype_account_number,
                @Field("bank_name") String bank_name,
                @Field("ifsc") String ifsc*/

        ): Call<ResponseBody>
    }


    //SAVE EDITED PROFILE INFO ON SERVER
    interface RB_saveBusinessInfo {

        @POST("seller/updateAccountInformation")
        fun responce(
                @Header("Authorization") token: String,
                @Query("section") section: String,
                @Query("business_name") business_name: String
        ): Call<ResponseBody>
    }


    //SAVE EDITED PROFILE INFO ON SERVER
    interface RB_saveShippingInfo {

        @POST("seller/updateAccountInformation")
        fun responce(
                @Header("Authorization") token: String,
                @Query("section") section: String,
                @Query("pickup_address1") pickup_address1: String,
                @Query("pickup_address2") pickup_address2: String,
                @Query("pickup_country_id") pickup_country_id: String,
                @Query("pickup_region") pickup_region: String,
                @Query("pickup_city") pickup_city: String,
                @Query("pickup_pincode") pickup_pincode: String
        ): Call<ResponseBody>
    }


    //CHANGE PASSWORD
    interface RB_changePassword {

        @POST("seller/updateAccountInformation")
        fun responce(
                @Header("Authorization") token: String,
                @Query("section") section: String,
                @Query("current_password") current_password: String,
                @Query("password") password: String,
                @Query("cpassword") confirm_password: String
        ): Call<ResponseBody>
    }

    //SAVE VACATION INFO
    interface RB_editVacationData {

        @POST("seller/updateAccountInformation")
        fun responce(
                @Header("Authorization") token: String,
                @Query("section") section: String,
                @Query("request_type") request_type: String,
                @Query("email") email: String,
                @Query("vacation_from_date") vacation_from_date: String,
                @Query("vacation_to_date") vacation_to_date: String,
                @Query("vacation_message") vacation_message: String
        ): Call<ResponseBody>
    }

    //GET INSTOCK PRODUCTS
    interface RB_vendorProducts {

        @POST("seller/product/getVendorProducts")
        fun responce(
                @Header("Authorization") token: String,
                @Query("type") type: String
        ): Call<ResponseBody>
    }

    //GET OUTSTOCK PRODUCTS
    interface RB_loadOutstockProducts {
        @GET("vendorapp/vendor/productliveostock")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET APPROVED PRODUCTS
    interface RB_loadApprovedProducts {
        @GET("vendorapp/vendor/productapprove")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET DISAPPROVED PRODUCTS
    interface RB_loadDisapprovedProducts {
        @GET("vendorapp/vendor/productdisapproved")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET PENDING PRODUCTS
    interface RB_loadPendingProducts {
        @GET("vendorapp/vendor/productpending")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET QUICK EDIT FORM
    interface RB_quickEditProducts {
        @GET("vendorapp/vendor/quickEditForm")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("id") id: String
        ): Call<ResponseBody>
    }

    //TO POST LISTED PRODUCT
    interface RB_listProduct {
        @POST("vendorapp/vendor/productlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("id") id: String
        ): Call<ResponseBody>
    }

    //TO LIST/UNLIST PRODUCTS
    interface RB_unlistProduct {
        @POST("seller/product/listUnlistVendorProduct")
        fun responce(
                @Header("Authorization") token: String,
                @Query("pid") product_id: String,
                @Query("type") type: String
        ): Call<ResponseBody>
    }

    //TO DELETE PRODUCTS FROM PENDING/DISAPPROVED LIST
    interface RB_deleteProduct {
        @DELETE("seller/product/deleteProduct")
        fun responce(
                @Header("Authorization") token: String,
                @Query("pid") pid: String,
                @Query("type") type: String
        ): Call<ResponseBody>
    }

    //TO POST DISAPPROVED PRODUCT
    interface RB_productDisappReason {
        @POST("vendorapp/vendor/productdisapprovedreason")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("id") id: String
        ): Call<ResponseBody>
    }

    //TO SAVE QUICK EDITED FORM
    interface RB_saveQuickEditForm {
        @POST("vendorapp/vendor/quickeditformsave")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("id") id: String,
                @Query("vendorproduct_qty") vendorproduct_qty: String,
                @Query("vendorproduct_price") vendorproduct_price: String,
                @Query("vendorproduct_spprice") vendorproduct_spprice: String,
                @Query("vendorproductreorder_level") vendorproductreorder_level: String,
                @Query("livespecial_from_date") livespecial_from_date: String,
                @Query("livespecial_to_date") livespecial_to_date: String
        ): Call<ResponseBody>
    }

    //GET ALL NEW ORDERS
    interface RB_loadOrders {
        @GET("seller/vendorOrders")
        fun responce(
                @Header("Authorization") token: String,
                @Query("section") status: String
        ): Call<ResponseBody>
    }

    //GET ALL CONFIRMED ORDERS
    interface RB_loadConfirmedOrders {
        @POST("vendorapp/vendor/confirmedorder")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("page") page: String,
                @Query("orderform") orderform: String,
                @Query("q") q: String,
                @Query("sort_order") order: String
        ): Call<ResponseBody>
    }


    //GET ALL CANCELED ORDERS
    interface RB_loadCanceledOrders {
        @POST("vendorapp/vendor/cancelorder")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("page") page: String,
                @Query("q") q: String,
                @Query("sort_order") order: String
        ): Call<ResponseBody>
    }

    //GET ALL COMPLETED ORDERS
    interface RB_loadCompletedOrders {
        @POST("vendorapp/vendor/completeorder")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("page") page: String,
                @Query("q") q: String,
                @Query("sort_order") order: String
        ): Call<ResponseBody>
    }

    //TO POST CONFIRMED ORDER
    interface RB_confirmOrderAction {
        @POST("vendorapp/vendor/confirmedorderaction")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("order_id") order_id: String
        ): Call<ResponseBody>
    }

    //TO POST CONFIRMED ORDER
    interface RB_cancelOrderAction {
        @POST("vendorapp/vendor/cancelorderaction")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("order_id") order_id: String
        ): Call<ResponseBody>
    }

    //TO VIEW ORDER
    interface RB_viewOrder {
        @POST("seller/vendorOrderDetails")
        fun responce(
                @Header("Authorization") token: String,
                @Query("orderId") orderId: String
        ): Call<ResponseBody>
    }

    //TO VIEW ORDER SHIPMENT DETAILS
    interface RB_viewOrderShipment {
        @POST("vendorapp/vendor/orderShipment")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("id") id: String
        ): Call<ResponseBody>
    }

    //TO GENERATE ORDER SHIPMENT
    interface RB_generateOrderShipment {
        @FormUrlEncoded
        @POST("vendorapp/vendor/orderShipmentSave")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("id") id: String,
                @Field("vendor_order_id") vendor_order_id: String,
                @Field("tracking[1][carrier_code]") trackingCarrier: String,
                @Field("tracking[1][title]") trackingTitle: String,
                @Field("tracking[1][number]") trackingNumber: String,
                @Field("shipment[comment_text]") shipmentText: String,
                @Field("shipment_id") shipment_id: String
        ): Call<ResponseBody>
    }

    //GET DISAPPROVED PRODUCTS
    interface RB_loadCommissionInvoice {
        @GET("seller/getCommissionInvoice")
        fun responce(
                @Header("Authorization") token: String

        ): Call<ResponseBody>
    }

    //GET DISAPPROVED PRODUCTS
    interface RB_loadTransactionSummary {
        @GET("seller/getFinancialTransactionSummary")
        fun responce(
                @Header("Authorization") token: String
        ): Call<ResponseBody>
    }

    //LOGOUT FROM APPLICATION
    interface RB_logout {
        @GET("vendorapp/vendor/logout")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String
        ): Call<ResponseBody>
    }

    //GET DASHBOARD MENU
    interface RB_dashboard {
        @GET("seller/vendorDashboard")
        fun responce(
                @Header("Authorization") token: String
        ): Call<ResponseBody>
    }

    //GET DASHBOARD DATA
    interface RB_dashboard_data {
        @GET("seller/vendorDashboard")
        fun responce(
                @Header("Authorization") token: String
        ): Call<ResponseBody>
    }

    //DOWNLOAD PDF
    interface RB_downLoadPdf {
        @POST("seller/downloadCommissionInvoice")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Query("vendor_payment_id") id: String
        ): Call<ResponseBody>
    }

    //GENERATE PACKAGING SLIP
    interface RB_generatePackSlip {
        @GET("vendorapp/vendor/packingSlipPrint")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("order_id") id: String
        ): Call<ResponseBody>
    }

    //GET VENDOR PROFILE
    interface RB_vendorProfile {
        @GET("seller/accountInformation")
        fun responce(
                @Header("Authorization") token: String
        ): Call<ResponseBody>
    }

    //GET VENDOR PROFILE
    interface RB_getCountryList {
        @GET("directory/countries")
        fun responce(
                @Header("Authorization") token: String
        ): Call<ResponseBody>
    }

    //CONTACT TO SERVER
    interface RB_contactUs {
        @POST("seller/submitQueryToAdmin")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Query("query") query: String,
                @Query("message") message: String

        ): Call<ResponseBody>
    }

    //TODO ADD-ONS API INTERFACE
    //GET RETURNS ORDER LIST
    interface RB_returnsOrderList {
        @GET("vendorapp/rma/rmalist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("dir") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //RMA VIEW
    interface RB_rmaView {
        @GET("vendorapp/rma/view")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("id") id: String

        ): Call<ResponseBody>
    }

    //RMA SAVE MESSAGE
    interface RB_rmaSaveMessage {
        @GET("vendorapp/rma/savemessage")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("rma_message") rmaMessage: String

        ): Call<ResponseBody>
    }

    //GET ADD DEAL PRODUCT  LIST
    interface RB_addDealList {
        @GET("vendorapp/deal/adddealproductlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET DEAL PRODUCT LIST
    interface RB_DealProductList {
        @GET("vendorapp/deal/dealproductlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET PRODUCT INFO FOR DEAL
    interface RB_getDealProductInfo {
        @GET("vendorapp/deal/addproductdeal")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("id") page: String

        ): Call<ResponseBody>
    }

    //SAVE DEAL
    interface RB_setDealProductInfo {
        @GET("vendorapp/deal/save")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("deal") deal: String

        ): Call<ResponseBody>
    }

    //DELETE DEAL
    interface RB_deleteDealProduct {
        @GET("vendorapp/deal/deletedeal")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("id") id: String

        ): Call<ResponseBody>
    }

    //GET PRODUCT QUESTION AND ANSWER
    interface RB_getProductQuestionList {
        @GET("vendorapp/productquestions/productquestionlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String

        ): Call<ResponseBody>
    }

    //GET PRODUCT QUESTION AND ANSWER
    interface RB_getAnswerList {
        @GET("vendorapp/productquestions/questionanswerlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("id") id: String
        ): Call<ResponseBody>
    }

    //GET ELIGIBLE PRODUCT LIST PRODUCT  LIST
    interface RB_getEligibleProductList {
        @GET("vendorapp/giftwrapper/giftwrapperproductlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET GIFTWRAPPER  PRODUCT  LIST
    interface RB_getGiftWrapperProductList {
        @GET("vendorapp/giftwrapper/giftwrapperlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //DELETE GIFTWRAPPER
    interface RB_deleteGiftWrapper {
        @GET("vendorapp/giftwrapper/deletegiftwrapper")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("giftwrapper_id") id: String

        ): Call<ResponseBody>
    }

    //GET GIFTWRAPPER DATA
    interface RB_getGiftWrapper {
        @GET("vendorapp/giftwrapper/addgiftwrapper")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("id") giftwrap: String


        ): Call<ResponseBody>
    }


    //SAVE GIFTWRAPPER DATA
    interface RB_saveGiftWrapper {
        @GET("vendorapp/giftwrapper/savegiftwrapper")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("giftwrapper") data: String


        ): Call<ResponseBody>
    }

    interface UploadSingleImage {


        @Multipart
        @POST("vendorapp/giftwrapper/savegiftwrapper")
        fun responce(
                /* @Query("device_id") RequestBody device_id,
                @Query("device_token") RequestBody device_token,*/
                @Header("code") code: String,
                @PartMap data: HashMap<String, RequestBody>,
                @Part file: MultipartBody.Part): Call<ResponseBody>
    }

    //GET ELIGIBLE PRODUCT ENABLE/DISABLE
    interface RB_setEnableDisable {
        @FormUrlEncoded
        @POST("vendorapp/giftwrapper/editgiftwrapperproduct")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Field("giftwrapper") data: String

        ): Call<ResponseBody>
    }

    //GET USERLIST
    interface RB_getUserList {
        @GET("seller/getVendorUserGrid")
        fun responce(
                @Header("Authorization") token: String
        ): Call<ResponseBody>
    }

    //GET ELIGIBLE PRODUCT ENABLE/DISABLE
    interface RB_setEnableDisableUser {
        @POST("seller/updateVendorUserStatus")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Query("user_id") vendorid: String,
                @Query("status") status: String

        ): Call<ResponseBody>
    }

    //GET CUMMUNICATION LIST
    interface RB_getCummunicationList {
        @GET("seller/getVendorBuyerGridForVendor")
        fun responce(
                @Header("Authorization") token: String
        ): Call<ResponseBody>
    }

    //GET COMMUNICATION INFO
    interface RB_getCummunicationInfo {
        @GET("seller/getChatHistoryForVendor")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Query("communication_id") communication_id: String
        ): Call<ResponseBody>
    }

    //SAVE VENDOR COMMUNICATION ANSWER
    interface RB_saveCummunicationAnswer {
        @POST("seller/submitQueryFromVendor")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Query("parent_id") parent_id: String,
                @Query("customer_id") customer_id: String,
                @Query("product_id") product_id: String,
                @Query("subject") subject: String,
                @Query("message") message: String
        ): Call<ResponseBody>
    }

    //GET VENDOR PRAMOTION LIST
    interface RB_getVendorPramotionList {
        @GET("vendorapp/vendorpromotion/promotionlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET ELIGIBLE PRODUCT ENABLE/DISABLE
    interface RB_setEnableDisableVendorPramotion {
        @FormUrlEncoded
        @POST("vendorapp/vendorpromotion/save")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Field("promotion") data: String

        ): Call<ResponseBody>
    }

    //GET REQUESTED BRAND LIST
    interface RB_getRequestedBrandList {
        @GET("vendorapp/brand/requestedbrandlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("page") page: String
        ): Call<ResponseBody>
    }

    //GET AUTHORIZED BRAND LIST
    interface RB_getAuthorizedBrandList {
        @GET("vendorapp/brand/authorizedbrandlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_token") device_token: String,
                @Query("device_id") device_id: String,
                @Query("page") page: String
        ): Call<ResponseBody>
    }

    //GET BUNDLE DISCOUNT LIST
    interface RB_getBundleDiscountList {
        @GET("vendorapp/bundlediscount/bundleproductlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("order") order: String,
                @Query("q") q: String
        ): Call<ResponseBody>
    }

    //GET BUNDLE DISCOUNT LIST
    interface RB_getBundleProductList {
        @GET("vendorapp/bundlediscount/productlist")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Query("page") page: String,
                @Query("id") id: String
        ): Call<ResponseBody>
    }

    //SET BUNDLE DISCOUNT PRODUCT ENABLE/DISABLE
    interface RB_setEnableDisableBundle {
        @FormUrlEncoded
        @POST("vendorapp/bundlediscount/savebundle")
        fun responce(
                @Header("code") code: String,
                @Query("device_id") device_id: String,
                @Query("device_token") device_token: String,
                @Field("bundle") data: String

        ): Call<ResponseBody>
    }

    interface RB_getAllMyQuote {
        @GET("rf-quote/seller/list")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String
        ): Call<ResponseBody>

    }

    interface RB_getMyQuoteDetails {
        @GET("rf-quote/{id}/seller/view")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Path("id") quoteId: String
        ): Call<ResponseBody>

    }

    interface RB_getMyQuoteComments {
        @GET("rf-quote/{id}/seller/comments")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Path("id") quoteId: String
        ): Call<ResponseBody>

    }

    interface RB_getMyQuoteHistory {
        @GET("rf-quote/{id}/seller/history")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Path("id") quoteId: String
        ): Call<ResponseBody>

    }

    interface RB_updateQuoteQty {
        @POST("rf-quote/{id}/seller/update")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Path("id") quoteId: String,
                @Body data: RequestBody
        ): Call<ResponseBody>

    }

    interface RB_recalculateQuote {
        @POST("rf-quote/{id}/seller/recalculate")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Path("id") quoteId: String,
                @Body data: RequestBody
        ): Call<ResponseBody>

    }

    interface RB_addCommentQuoteQty {
        @POST("rf-quote/{id}/seller/send")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Path("id") quoteId: String,
                @Query("item_id") itemid: String,
                @Query("comment") comment: String
        ): Call<ResponseBody>

    }

    interface RB_ConfirmQuote {
        @POST("rf-quote/{id}/seller/confirm")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Path("id") quoteId: String,
                @Body data: RequestBody
        ): Call<ResponseBody>

    }

    interface RB_DeclineQuote {
        @POST("rf-quote/{id}/seller/decline")
        fun responce(
                @Header("code") code: String,
                @Header("Authorization") token: String,
                @Path("id") quoteId: String,
                @Body data: RequestBody
        ): Call<ResponseBody>

    }


}
