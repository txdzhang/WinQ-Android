package com.stratagile.qlink.data.api;/** * Created by hu on 2017/5/16. */public interface API {    //http://dapp-t.qlink.mobi/api/    String BASE_URL = "http://dapp-t.qlink.mobi/";    //http://dapp-t.qlink.mobi/    //http://192.168.1.111:8080/dapp/    String BASE_URL_DEVOLOP = "http://47.90.50.172/api/";    long CONNECT_TIMEOUT = 60 * 1000;    long IO_TIMEOUT = 60 * 1000;    /**     * 查询ssid是否注册     * @see API#url_get_ssids     */    @Deprecated    String url_get_ssid = BASE_URL + "api/neo/ssId/query.json";    /**     * 查询ssid是否注册     */    String url_get_ssids = BASE_URL + "api/neo/ssId/querys.json";    /**     * 注册wifi资产     * registerWifiByFee     */    String url_save_ssid = BASE_URL + "api/neo/ssId/registerWifiByFee.json";    /**     * 注册wifi资产     * registerWifiByFee     * 第二版本     */    String url_save_ssid2 = BASE_URL + "api/neo/ssId/registerWifiByFeeV4.json";    /**     * 连接WiFi后调用，在断开WiFi的时候还需要调用另外一个接口     */    String url_record_save = BASE_URL + "api/neo/record/save.json";    /**     * 获取使用历史记录     * @see API#url_record_querys     */    @Deprecated    String url_record_query = BASE_URL + "api/neo/record/query.json";    /**     * 获取使用历史记录     */    String url_record_querys = BASE_URL + "api/neo/record/querys.json";    /**     * 创建钱包     */    String url_createWallet = BASE_URL + "api/neo/createWalletV2.json";    /**     * 导入钱包     */    String url_importWallet = BASE_URL + "api/neo/exportKey.json";    /**     * 批量导入钱包     */    String url_batchImportWallet = BASE_URL + "api/neo/batchExportKey.json";    /**     * 获取资产     */    String url_getBalance = BASE_URL + "api/neo/getTokenBalance.json";    /**     * 打赏     */    String url_reward = BASE_URL + "api/neo/wif/ds.json";    /**     * c层需要的数据，通过这个接口拿的     */    String url_c_nodes = "https://nodes.tox.chat/json";    /**     * 获取汇率     */    String url_get_raw = BASE_URL + "api/neo/raw.json";    /**     * neo兑换为qlc     */    String url_neo_exchange_qlc = BASE_URL + "api/neo/neoExchangeQlcV2.json";    /**     * 交易接口     */    String url_transaction = BASE_URL + "api/neo/transfer.json";    /**     * 注册vpn资产     */    String url_vpn_save = BASE_URL + "api/neo/ssId/registerVpnByFee.json";    /**     * 注册vpn资产     * (第二版本)     */    String url_vpn_save2 = BASE_URL + "api/neo/ssId/registerVpnByFeeV4.json";    /**     * 根据国家获取vpn资产列表接口     */    String url_vpn_query = BASE_URL + "api/neo/vpn/queryVpnV2.json";    String url_vpn_query_v3 = BASE_URL + "api/neo/vpn/queryVpnV3.json";    String latlngParseCountry = "https://maps.google.com/maps/api/geocode/json";    /**     * 验证vpn名字是否存在     */    String vertify_vpn_name = BASE_URL + "api/neo/validateAssetIsexist.json";    /**     * 保存vpn记录接口     */    String vpn_record_save = BASE_URL + "api/neo/vpn/saveCVpnRecord.json";    /**     * 更新用户的头像     */    String user_update_avatar = BASE_URL + "fapi/user/uploadHeadView.json";    /**     * 心跳     */    String heart_beat = BASE_URL + "api/neo/heartbeatV3.json";    /**     * 更新vpn基本信息接口     */    String update_vpn_info = BASE_URL + "api/neo/ssId/updateVpnInfoV3.json";    /**     * 更新wifi基本信息接口     */    String update_wifi_info = BASE_URL + "api/neo/ssId/updateWifiInfoV3.json";    /**     * 获取自己的头像的接口     */    String user_headView = BASE_URL + "fapi/user/getHeadView.json";    /**     * 获取unspent     */    String getUnspentAsset = BASE_URL + "api/neo/allUnpspentAsset.json";    /**     * 转账的的直接调用接口，app中不直接调用。     */    String sendRow = BASE_URL + "api/neo/sendrawtransaction.json";    /**     * 连接vpn和打赏的接口     */    String url_transaction_v2 = BASE_URL + "api/neo/ssId/transTypeOperate.json";    /**     * 获取主兑换地址，包括neo兑换为qlc的地址和bnb兑换为qlc的地址     */    String url_main_address = BASE_URL + "api/neo/getMainAddressV2.json";    /**     * bnb兑换qlc的接口     */    String url_bnb_2_qlc = BASE_URL + "api/neo/bnbExchangeQlc.json";    /**     * 查询以太坊钱包余额     */    String url_eth_wallet_value = "https://api.ethplorer.io/getAddressInfo/{address}";    /**     * 获取服务器时间     */    String url_get_server_time = BASE_URL + "api/wc/getServerTime.json";    /**     * 获取赛程列表接口     */    String url_race_times = BASE_URL + "api/wc/raceTimes.json";    /**     * 用户投注列表接口     */    String url_findbet = BASE_URL + "api/wc/findBets.json";    /**     * 投注接口     */    String url_bet = BASE_URL + "api/wc/bet.json";    /**     * 赠送免费次数接     */    String url_zs_free_num = BASE_URL + "api/neo/zsFreeNum.json";    /**     * 免费连接vpn接口     */    String url_freeConnection = BASE_URL + "api/neo/vpn/freeConnection.json";    /**     * 查找免费使用记录接口     */    String url_queryFreeRecords = BASE_URL + "api/neo/queryFreeRecords.json";}