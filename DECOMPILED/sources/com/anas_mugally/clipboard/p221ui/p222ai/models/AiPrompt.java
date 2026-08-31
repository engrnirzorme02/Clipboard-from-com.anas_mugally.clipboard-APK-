package com.anas_mugally.clipboard.p221ui.p222ai.models;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class AiPrompt {
    private final long createdAt;

    /* JADX INFO: renamed from: id */
    private String f13103id;
    private final boolean isCustom;
    private final String prompt;
    private final String title;

    public AiPrompt(String id, String title, String prompt, boolean z7, long j7) {
        AbstractC6118n.m27187e(id, "id");
        AbstractC6118n.m27187e(title, "title");
        AbstractC6118n.m27187e(prompt, "prompt");
        this.f13103id = id;
        this.title = title;
        this.prompt = prompt;
        this.isCustom = z7;
        this.createdAt = j7;
    }

    public static /* synthetic */ AiPrompt copy$default(AiPrompt aiPrompt, String str, String str2, String str3, boolean z7, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = aiPrompt.f13103id;
        }
        if ((i7 & 2) != 0) {
            str2 = aiPrompt.title;
        }
        if ((i7 & 4) != 0) {
            str3 = aiPrompt.prompt;
        }
        if ((i7 & 8) != 0) {
            z7 = aiPrompt.isCustom;
        }
        if ((i7 & 16) != 0) {
            j7 = aiPrompt.createdAt;
        }
        long j8 = j7;
        return aiPrompt.copy(str, str2, str3, z7, j8);
    }

    public final String component1() {
        return this.f13103id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.prompt;
    }

    public final boolean component4() {
        return this.isCustom;
    }

    public final long component5() {
        return this.createdAt;
    }

    public final AiPrompt copy(String id, String title, String prompt, boolean z7, long j7) {
        AbstractC6118n.m27187e(id, "id");
        AbstractC6118n.m27187e(title, "title");
        AbstractC6118n.m27187e(prompt, "prompt");
        return new AiPrompt(id, title, prompt, z7, j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiPrompt)) {
            return false;
        }
        AiPrompt aiPrompt = (AiPrompt) obj;
        return AbstractC6118n.m27183a(this.f13103id, aiPrompt.f13103id) && AbstractC6118n.m27183a(this.title, aiPrompt.title) && AbstractC6118n.m27183a(this.prompt, aiPrompt.prompt) && this.isCustom == aiPrompt.isCustom && this.createdAt == aiPrompt.createdAt;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f13103id;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.f13103id.hashCode() * 31) + this.title.hashCode()) * 31) + this.prompt.hashCode()) * 31) + Boolean.hashCode(this.isCustom)) * 31) + Long.hashCode(this.createdAt);
    }

    public final boolean isCustom() {
        return this.isCustom;
    }

    public final void setId(String str) {
        AbstractC6118n.m27187e(str, "<set-?>");
        this.f13103id = str;
    }

    public String toString() {
        return "AiPrompt(id=" + this.f13103id + ", title=" + this.title + ", prompt=" + this.prompt + ", isCustom=" + this.isCustom + ", createdAt=" + this.createdAt + ')';
    }

    public /* synthetic */ AiPrompt(String str, String str2, String str3, boolean z7, long j7, int i7, AbstractC6112h abstractC6112h) {
        this((i7 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, (i7 & 8) != 0 ? false : z7, (i7 & 16) != 0 ? System.currentTimeMillis() : j7);
    }
}
