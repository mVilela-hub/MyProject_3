package com.epicgames.ue4;

import com.YourCompany.mobilia_para_migrate.OBBDownloaderService;
import com.YourCompany.mobilia_para_migrate.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

