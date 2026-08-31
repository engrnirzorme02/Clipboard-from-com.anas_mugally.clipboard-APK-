package com.anas_mugally.clipboard.p221ui.p222ai.models;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessingResultData implements Serializable {
    private final Integer processing_time;
    private final Integer remainingRequests;
    private final String text;

    public ProcessingResultData(String text, Integer num, Integer num2) {
        AbstractC6118n.m27187e(text, "text");
        this.text = text;
        this.processing_time = num;
        this.remainingRequests = num2;
    }

    public static /* synthetic */ ProcessingResultData copy$default(ProcessingResultData processingResultData, String str, Integer num, Integer num2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = processingResultData.text;
        }
        if ((i7 & 2) != 0) {
            num = processingResultData.processing_time;
        }
        if ((i7 & 4) != 0) {
            num2 = processingResultData.remainingRequests;
        }
        return processingResultData.copy(str, num, num2);
    }

    public final String component1() {
        return this.text;
    }

    public final Integer component2() {
        return this.processing_time;
    }

    public final Integer component3() {
        return this.remainingRequests;
    }

    public final ProcessingResultData copy(String text, Integer num, Integer num2) {
        AbstractC6118n.m27187e(text, "text");
        return new ProcessingResultData(text, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessingResultData)) {
            return false;
        }
        ProcessingResultData processingResultData = (ProcessingResultData) obj;
        return AbstractC6118n.m27183a(this.text, processingResultData.text) && AbstractC6118n.m27183a(this.processing_time, processingResultData.processing_time) && AbstractC6118n.m27183a(this.remainingRequests, processingResultData.remainingRequests);
    }

    public final Integer getProcessing_time() {
        return this.processing_time;
    }

    public final Integer getRemainingRequests() {
        return this.remainingRequests;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.processing_time;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.remainingRequests;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ProcessingResultData(text=" + this.text + ", processing_time=" + this.processing_time + ", remainingRequests=" + this.remainingRequests + ')';
    }

    public /* synthetic */ ProcessingResultData(String str, Integer num, Integer num2, int i7, AbstractC6112h abstractC6112h) {
        this(str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : num2);
    }
}
