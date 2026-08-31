package com.anas_mugally.clipboard.p221ui.p222ai.models;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class ApiResponse {
    private final String errorCode;
    private final String errorMessage;
    private final ProcessingResultData result;
    private final Long server_time;
    private final boolean success;
    private final String timestamp;

    public ApiResponse(boolean z7, ProcessingResultData processingResultData, String str, String str2, String str3, Long l7) {
        this.success = z7;
        this.result = processingResultData;
        this.errorCode = str;
        this.errorMessage = str2;
        this.timestamp = str3;
        this.server_time = l7;
    }

    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, boolean z7, ProcessingResultData processingResultData, String str, String str2, String str3, Long l7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = apiResponse.success;
        }
        if ((i7 & 2) != 0) {
            processingResultData = apiResponse.result;
        }
        if ((i7 & 4) != 0) {
            str = apiResponse.errorCode;
        }
        if ((i7 & 8) != 0) {
            str2 = apiResponse.errorMessage;
        }
        if ((i7 & 16) != 0) {
            str3 = apiResponse.timestamp;
        }
        if ((i7 & 32) != 0) {
            l7 = apiResponse.server_time;
        }
        String str4 = str3;
        Long l8 = l7;
        return apiResponse.copy(z7, processingResultData, str, str2, str4, l8);
    }

    public final boolean component1() {
        return this.success;
    }

    public final ProcessingResultData component2() {
        return this.result;
    }

    public final String component3() {
        return this.errorCode;
    }

    public final String component4() {
        return this.errorMessage;
    }

    public final String component5() {
        return this.timestamp;
    }

    public final Long component6() {
        return this.server_time;
    }

    public final ApiResponse copy(boolean z7, ProcessingResultData processingResultData, String str, String str2, String str3, Long l7) {
        return new ApiResponse(z7, processingResultData, str, str2, str3, l7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        return this.success == apiResponse.success && AbstractC6118n.m27183a(this.result, apiResponse.result) && AbstractC6118n.m27183a(this.errorCode, apiResponse.errorCode) && AbstractC6118n.m27183a(this.errorMessage, apiResponse.errorMessage) && AbstractC6118n.m27183a(this.timestamp, apiResponse.timestamp) && AbstractC6118n.m27183a(this.server_time, apiResponse.server_time);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ProcessingResultData getResult() {
        return this.result;
    }

    public final Long getServer_time() {
        return this.server_time;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        ProcessingResultData processingResultData = this.result;
        int iHashCode2 = (iHashCode + (processingResultData == null ? 0 : processingResultData.hashCode())) * 31;
        String str = this.errorCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timestamp;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l7 = this.server_time;
        return iHashCode5 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "ApiResponse(success=" + this.success + ", result=" + this.result + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", timestamp=" + this.timestamp + ", server_time=" + this.server_time + ')';
    }

    public /* synthetic */ ApiResponse(boolean z7, ProcessingResultData processingResultData, String str, String str2, String str3, Long l7, int i7, AbstractC6112h abstractC6112h) {
        this(z7, (i7 & 2) != 0 ? null : processingResultData, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : l7);
    }
}
