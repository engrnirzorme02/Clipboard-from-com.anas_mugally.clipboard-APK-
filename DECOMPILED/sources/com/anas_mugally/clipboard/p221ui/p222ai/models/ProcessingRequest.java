package com.anas_mugally.clipboard.p221ui.p222ai.models;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessingRequest {
    private final long appVersionCode;
    private final String customPrompt;
    private final String promptType;
    private final String purchasedToken;
    private final String targetLanguage;
    private final String text;
    private final String uid;

    public ProcessingRequest(String uid, String str, String text, String promptType, String str2, String str3, long j7) {
        AbstractC6118n.m27187e(uid, "uid");
        AbstractC6118n.m27187e(text, "text");
        AbstractC6118n.m27187e(promptType, "promptType");
        this.uid = uid;
        this.purchasedToken = str;
        this.text = text;
        this.promptType = promptType;
        this.customPrompt = str2;
        this.targetLanguage = str3;
        this.appVersionCode = j7;
    }

    public static /* synthetic */ ProcessingRequest copy$default(ProcessingRequest processingRequest, String str, String str2, String str3, String str4, String str5, String str6, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = processingRequest.uid;
        }
        if ((i7 & 2) != 0) {
            str2 = processingRequest.purchasedToken;
        }
        if ((i7 & 4) != 0) {
            str3 = processingRequest.text;
        }
        if ((i7 & 8) != 0) {
            str4 = processingRequest.promptType;
        }
        if ((i7 & 16) != 0) {
            str5 = processingRequest.customPrompt;
        }
        if ((i7 & 32) != 0) {
            str6 = processingRequest.targetLanguage;
        }
        if ((i7 & 64) != 0) {
            j7 = processingRequest.appVersionCode;
        }
        long j8 = j7;
        String str7 = str5;
        String str8 = str6;
        return processingRequest.copy(str, str2, str3, str4, str7, str8, j8);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.purchasedToken;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.promptType;
    }

    public final String component5() {
        return this.customPrompt;
    }

    public final String component6() {
        return this.targetLanguage;
    }

    public final long component7() {
        return this.appVersionCode;
    }

    public final ProcessingRequest copy(String uid, String str, String text, String promptType, String str2, String str3, long j7) {
        AbstractC6118n.m27187e(uid, "uid");
        AbstractC6118n.m27187e(text, "text");
        AbstractC6118n.m27187e(promptType, "promptType");
        return new ProcessingRequest(uid, str, text, promptType, str2, str3, j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessingRequest)) {
            return false;
        }
        ProcessingRequest processingRequest = (ProcessingRequest) obj;
        return AbstractC6118n.m27183a(this.uid, processingRequest.uid) && AbstractC6118n.m27183a(this.purchasedToken, processingRequest.purchasedToken) && AbstractC6118n.m27183a(this.text, processingRequest.text) && AbstractC6118n.m27183a(this.promptType, processingRequest.promptType) && AbstractC6118n.m27183a(this.customPrompt, processingRequest.customPrompt) && AbstractC6118n.m27183a(this.targetLanguage, processingRequest.targetLanguage) && this.appVersionCode == processingRequest.appVersionCode;
    }

    public final long getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getCustomPrompt() {
        return this.customPrompt;
    }

    public final String getPromptType() {
        return this.promptType;
    }

    public final String getPurchasedToken() {
        return this.purchasedToken;
    }

    public final String getTargetLanguage() {
        return this.targetLanguage;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iHashCode = this.uid.hashCode() * 31;
        String str = this.purchasedToken;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.text.hashCode()) * 31) + this.promptType.hashCode()) * 31;
        String str2 = this.customPrompt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetLanguage;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.appVersionCode);
    }

    public String toString() {
        return "ProcessingRequest(uid=" + this.uid + ", purchasedToken=" + this.purchasedToken + ", text=" + this.text + ", promptType=" + this.promptType + ", customPrompt=" + this.customPrompt + ", targetLanguage=" + this.targetLanguage + ", appVersionCode=" + this.appVersionCode + ')';
    }

    public /* synthetic */ ProcessingRequest(String str, String str2, String str3, String str4, String str5, String str6, long j7, int i7, AbstractC6112h abstractC6112h) {
        this(str, str2, str3, str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6, j7);
    }
}
