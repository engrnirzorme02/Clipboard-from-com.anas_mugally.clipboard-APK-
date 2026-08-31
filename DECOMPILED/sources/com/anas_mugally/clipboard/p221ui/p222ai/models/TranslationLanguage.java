package com.anas_mugally.clipboard.p221ui.p222ai.models;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class TranslationLanguage {
    private final String code;
    private final String name;
    private final String nativeName;

    public TranslationLanguage(String code, String name, String nativeName) {
        AbstractC6118n.m27187e(code, "code");
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(nativeName, "nativeName");
        this.code = code;
        this.name = name;
        this.nativeName = nativeName;
    }

    public static /* synthetic */ TranslationLanguage copy$default(TranslationLanguage translationLanguage, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = translationLanguage.code;
        }
        if ((i7 & 2) != 0) {
            str2 = translationLanguage.name;
        }
        if ((i7 & 4) != 0) {
            str3 = translationLanguage.nativeName;
        }
        return translationLanguage.copy(str, str2, str3);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.nativeName;
    }

    public final TranslationLanguage copy(String code, String name, String nativeName) {
        AbstractC6118n.m27187e(code, "code");
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(nativeName, "nativeName");
        return new TranslationLanguage(code, name, nativeName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationLanguage)) {
            return false;
        }
        TranslationLanguage translationLanguage = (TranslationLanguage) obj;
        return AbstractC6118n.m27183a(this.code, translationLanguage.code) && AbstractC6118n.m27183a(this.name, translationLanguage.name) && AbstractC6118n.m27183a(this.nativeName, translationLanguage.nativeName);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNativeName() {
        return this.nativeName;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.nativeName.hashCode();
    }

    public String toString() {
        return "TranslationLanguage(code=" + this.code + ", name=" + this.name + ", nativeName=" + this.nativeName + ')';
    }
}
