package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrv {
    public static final zzgjz zza;
    public static final zzgjz zzb;
    private final String zzc;
    private final zzdru zzd;
    private final zzdru zze;

    static {
        zzdru zzdruVar = zzdru.PUBLIC_API_CALL;
        zzdru zzdruVar2 = zzdru.PUBLIC_API_CALLBACK;
        zzdrv zzdrvVar = new zzdrv("tqgt", zzdruVar, zzdruVar2);
        zzdru zzdruVar3 = zzdru.DYNAMITE_ENTER;
        zzdrv zzdrvVar2 = new zzdrv("l.dl", zzdruVar, zzdruVar3);
        zzdru zzdruVar4 = zzdru.READ_FROM_DISK_START;
        zzdrv zzdrvVar3 = new zzdrv("l.rccde", zzdruVar3, zzdruVar4);
        zzdrv zzdrvVar4 = new zzdrv("l.rfd", zzdruVar4, zzdru.READ_FROM_DISK_END);
        zzdru zzdruVar5 = zzdru.CLIENT_SIGNALS_START;
        zzdrv zzdrvVar5 = new zzdrv("l.rcc", zzdruVar3, zzdruVar5);
        zzdru zzdruVar6 = zzdru.CLIENT_SIGNALS_END;
        zzdrv zzdrvVar6 = new zzdrv("l.cs", zzdruVar5, zzdruVar6);
        zzdru zzdruVar7 = zzdru.SERVICE_CONNECTED;
        zzdrv zzdrvVar7 = new zzdrv("l.cts", zzdruVar6, zzdruVar7);
        zzdru zzdruVar8 = zzdru.GMS_SIGNALS_START;
        zzdru zzdruVar9 = zzdru.GMS_SIGNALS_END;
        zzdrv zzdrvVar8 = new zzdrv("l.gs", zzdruVar8, zzdruVar9);
        zzdru zzdruVar10 = zzdru.GET_SIGNALS_SDKCORE_START;
        zzdrv zzdrvVar9 = new zzdrv("l.jse", zzdruVar9, zzdruVar10);
        zzdru zzdruVar11 = zzdru.GET_SIGNALS_SDKCORE_END;
        zzdrv zzdrvVar10 = new zzdrv("l.gs-sdkcore", zzdruVar10, zzdruVar11);
        zzdrv zzdrvVar11 = new zzdrv("l.gs-pp", zzdruVar11, zzdruVar2);
        zzdru zzdruVar12 = zzdru.RENDERING_START;
        zzdrv zzdrvVar12 = new zzdrv("l.render", zzdruVar12, zzdruVar2);
        zzdru zzdruVar13 = zzdru.RENDERING_WEBVIEW_CREATION_START;
        zzdrv zzdrvVar13 = new zzdrv("l.render.pre", zzdruVar12, zzdruVar13);
        zzdru zzdruVar14 = zzdru.RENDERING_WEBVIEW_CREATION_END;
        zzdrv zzdrvVar14 = new zzdrv("l.render.wvc", zzdruVar13, zzdruVar14);
        zzdru zzdruVar15 = zzdru.RENDERING_AD_COMPONENT_CREATION_END;
        zzdrv zzdrvVar15 = new zzdrv("l.render.acc", zzdruVar14, zzdruVar15);
        zzdru zzdruVar16 = zzdru.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdru zzdruVar17 = zzdru.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdrv zzdrvVar16 = new zzdrv("l.render.cfg-wv", zzdruVar16, zzdruVar17);
        zzdru zzdruVar18 = zzdru.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdru zzdruVar19 = zzdru.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzgjz.zzo(zzdrvVar, zzdrvVar2, zzdrvVar3, zzdrvVar4, zzdrvVar5, zzdrvVar6, zzdrvVar7, zzdrvVar8, zzdrvVar9, zzdrvVar10, zzdrvVar11, zzdrvVar12, zzdrvVar13, zzdrvVar14, zzdrvVar15, zzdrvVar16, new zzdrv("l.render.wvlh", zzdruVar18, zzdruVar19), new zzdrv("l.render.post", zzdruVar19, zzdruVar2), new zzdrv("l.sodv", zzdru.SIGNAL_ON_DISK_VALIDATION_START, zzdru.SIGNAL_ON_DISK_VALIDATION_END), new zzdrv("l.sodck", zzdru.SIGNAL_ON_DISK_CACHE_KEY_START, zzdru.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdrv("l.sodrar", zzdru.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdru.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdrv("l.soddc", zzdru.SIGNAL_ON_DISK_DECODE_START, zzdru.SIGNAL_ON_DISK_DECODE_END));
        zzdrv zzdrvVar17 = new zzdrv("l.al", zzdruVar, zzdruVar2);
        zzdrv zzdrvVar18 = new zzdrv("l.al2", zzdruVar3, zzdruVar2);
        zzdrv zzdrvVar19 = new zzdrv("l.dl", zzdruVar, zzdruVar3);
        zzdrv zzdrvVar20 = new zzdrv("l.rcc", zzdruVar3, zzdruVar5);
        zzdrv zzdrvVar21 = new zzdrv("l.cs", zzdruVar5, zzdruVar6);
        zzdrv zzdrvVar22 = new zzdrv("l.cts", zzdruVar6, zzdruVar7);
        zzdrv zzdrvVar23 = new zzdrv("l.gs", zzdruVar8, zzdruVar9);
        zzdru zzdruVar20 = zzdru.GET_AD_DICTIONARY_SDKCORE_START;
        zzdrv zzdrvVar24 = new zzdrv("l.jse", zzdruVar9, zzdruVar20);
        zzdru zzdruVar21 = zzdru.GET_AD_DICTIONARY_SDKCORE_END;
        zzdrv zzdrvVar25 = new zzdrv("l.gad-js", zzdruVar20, zzdruVar21);
        zzdru zzdruVar22 = zzdru.HTTP_RESPONSE_READY;
        zzdrv zzdrvVar26 = new zzdrv("l.http", zzdruVar21, zzdruVar22);
        zzdru zzdruVar23 = zzdru.SCAR_PRELOADER_READY;
        zzdrv zzdrvVar27 = new zzdrv("l.slas.pre", zzdruVar, zzdruVar23);
        zzdru zzdruVar24 = zzdru.SCAR_PRELOADER_PROCESSING_DONE;
        zzdrv zzdrvVar28 = new zzdrv("l.slas.prel.p", zzdruVar23, zzdruVar24);
        zzdru zzdruVar25 = zzdru.NORMALIZATION_AD_RESPONSE_START;
        zzdrv zzdrvVar29 = new zzdrv("l.jse-nml", zzdruVar22, zzdruVar25);
        zzdrv zzdrvVar30 = new zzdrv("l.jse-nml", zzdruVar24, zzdruVar25);
        zzdru zzdruVar26 = zzdru.NORMALIZATION_AD_RESPONSE_END;
        zzdrv zzdrvVar31 = new zzdrv("l.nml-js", zzdruVar25, zzdruVar26);
        zzdru zzdruVar27 = zzdru.BINDER_CALL_START;
        zzdrv zzdrvVar32 = new zzdrv("l.nml-gmsg", zzdruVar26, zzdruVar27);
        zzdru zzdruVar28 = zzdru.SERVER_RESPONSE_PARSE_START;
        zzdrv zzdrvVar33 = new zzdrv("l.nml-gmsg.s2s", zzdruVar26, zzdruVar28);
        zzdrv zzdrvVar34 = new zzdrv("l.binder", zzdruVar27, zzdruVar28);
        zzdrv zzdrvVar35 = new zzdrv("l.sr", zzdruVar28, zzdruVar12);
        zzdrv zzdrvVar36 = new zzdrv("l.render", zzdruVar12, zzdruVar2);
        zzdrv zzdrvVar37 = new zzdrv("l.t2", zzdru.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdru.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdru zzdruVar29 = zzdru.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdru zzdruVar30 = zzdru.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdrv zzdrvVar38 = new zzdrv("l.render.na.js", zzdruVar29, zzdruVar30);
        zzdrv zzdrvVar39 = new zzdrv("l.render.na.prep", zzdruVar30, zzdru.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdrv zzdrvVar40 = new zzdrv("l.render.na.lna", zzdru.RENDERING_NATIVE_ASSETS_LOADING_START, zzdru.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdrv zzdrvVar41 = new zzdrv("l.render.wvc", zzdruVar13, zzdruVar14);
        zzdrv zzdrvVar42 = new zzdrv("l.render.acc", zzdruVar14, zzdruVar15);
        zzdrv zzdrvVar43 = new zzdrv("l.render.cfg-wv", zzdruVar16, zzdruVar17);
        zzdrv zzdrvVar44 = new zzdrv("l.render.pre", zzdruVar12, zzdruVar13);
        zzdrv zzdrvVar45 = new zzdrv("l.render.post", zzdruVar19, zzdruVar2);
        zzdrv zzdrvVar46 = new zzdrv("l.render.na.post", zzdruVar17, zzdruVar2);
        zzdrv zzdrvVar47 = new zzdrv("l.render.wvlh", zzdruVar18, zzdruVar19);
        zzdrv zzdrvVar48 = new zzdrv("l.na.b", zzdru.NATIVE_ASSETS_LOADING_BASIC_START, zzdru.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdrv zzdrvVar49 = new zzdrv("l.na.im", zzdru.NATIVE_ASSETS_LOADING_IMAGE_START, zzdru.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdrv zzdrvVar50 = new zzdrv("l.na.imc", zzdru.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdru.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdrv zzdrvVar51 = new zzdrv("l.na.l", zzdru.NATIVE_ASSETS_LOADING_LOGO_START, zzdru.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdrv zzdrvVar52 = new zzdrv("l.na.ic", zzdru.NATIVE_ASSETS_LOADING_ICON_START, zzdru.NATIVE_ASSETS_LOADING_ICON_END);
        zzdrv zzdrvVar53 = new zzdrv("l.na.a", zzdru.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdru.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzdru zzdruVar31 = zzdru.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdru zzdruVar32 = zzdru.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzgjz.zzo(zzdrvVar17, zzdrvVar18, zzdrvVar19, zzdrvVar20, zzdrvVar21, zzdrvVar22, zzdrvVar23, zzdrvVar24, zzdrvVar25, zzdrvVar26, zzdrvVar27, zzdrvVar28, zzdrvVar29, zzdrvVar30, zzdrvVar31, zzdrvVar32, zzdrvVar33, zzdrvVar34, zzdrvVar35, zzdrvVar36, zzdrvVar37, zzdrvVar38, zzdrvVar39, zzdrvVar40, zzdrvVar41, zzdrvVar42, zzdrvVar43, zzdrvVar44, zzdrvVar45, zzdrvVar46, zzdrvVar47, zzdrvVar48, zzdrvVar49, zzdrvVar50, zzdrvVar51, zzdrvVar52, zzdrvVar53, new zzdrv("l.na.v", zzdruVar31, zzdruVar32), new zzdrv("l.na.vc", zzdru.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdruVar32), new zzdrv("l.na.m", zzdru.NATIVE_ASSETS_LOADING_MEDIA_START, zzdru.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdrv("l.na.c", zzdru.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdru.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdrv("l.na.o", zzdru.NATIVE_ASSETS_LOADING_OMID_START, zzdru.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdrv(String str, zzdru zzdruVar, zzdru zzdruVar2) {
        this.zzc = str;
        this.zzd = zzdruVar;
        this.zze = zzdruVar2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final zzdru zzb() {
        return this.zzd;
    }

    public final zzdru zzc() {
        return this.zze;
    }
}
